package com.hopital.patientms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hopital.patientms.model.Séjourner;

public interface SéjournerRepository extends JpaRepository<Séjourner, Long> {

}
