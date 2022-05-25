package com.hopital.patientms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hopital.patientms.exception.PatientNotFoundException;
import com.hopital.patientms.model.Patient;
import com.hopital.patientms.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/patients")
public class PatientController {
    
    @Autowired
    private PatientRepository patientRepo;
    
    @GetMapping("/")
    public List<Patient> getAllPatient() {
        return this.patientRepo.findAll();
    }
    
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable("id") Long id) {
        return this.patientRepo.findById(id)
            .orElseThrow(() -> new PatientNotFoundException(id));
    }
    
    @PostMapping("/")
    public ResponseEntity<Map<String, Boolean>> createPatient(@RequestBody Patient patient) {
        this.patientRepo.save(patient);
        
        Map<String, Boolean> response = new HashMap<>();
        response.put("created", Boolean.TRUE);
        
        return ResponseEntity.ok(response);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable("id") long id, @RequestBody Patient patientDetails) {
        Patient patient = this.patientRepo.findById(id)
            .orElseThrow(() -> new PatientNotFoundException(id));
        
        patient.setNom(patientDetails.getNom());
        patient.setPrenom(patientDetails.getPrenom());
        patient.setTelephone(patientDetails.getTelephone());
        patient.setAdresse(patientDetails.getAdresse());
        patient.setCodePostal(patientDetails.getCodePostal());
        patient.setVille(patientDetails.getVille());
        
        Patient updatedEmployee = this.patientRepo.save(patient);
        return ResponseEntity.ok(updatedEmployee);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePatient(@PathVariable("id") long id) {
        Patient patient = this.patientRepo.findById(id)
            .orElseThrow(() -> new PatientNotFoundException(id));
            
        patient.setActif(false);
        
        this.patientRepo.save(patient);
        
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        
        return ResponseEntity.ok(response);
    }
}
