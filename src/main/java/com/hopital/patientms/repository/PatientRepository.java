package com.hopital.patientms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hopital.patientms.model.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
