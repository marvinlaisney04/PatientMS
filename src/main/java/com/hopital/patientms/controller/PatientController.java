package com.hopital.patientms.controller;

import java.util.List;
import com.hopital.patientms.model.Patient;
import com.hopital.patientms.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PatientController {

    @Autowired
    private PatientRepository patientRepo;

    @GetMapping("/patient")
    public List<Patient> getAllPatient(){
        return this.patientRepo.findAll();
    }

    @GetMapping("/patient/{id}")
    public Patient getPatientById(@PathVariable("id") long id){
        return this.patientRepo.getById(id);
    }
}
