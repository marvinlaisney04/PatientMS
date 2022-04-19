package com.hopital.patientms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hopital.patientms.model.Séjour;

public interface SéjourRepository extends JpaRepository<Séjour, Long> {

}
