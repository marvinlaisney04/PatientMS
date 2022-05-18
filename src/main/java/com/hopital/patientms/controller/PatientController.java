package com.hopital.patientms.controller;

import java.util.List;
import java.util.Optional;

import com.hopital.patientms.model.Patient;
import com.hopital.patientms.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepo;

    @GetMapping("/")
    public List<Patient> getAllPatient(){
        return this.patientRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable("id") Long id){
        return this.patientRepo.findById(id);
    }
}
