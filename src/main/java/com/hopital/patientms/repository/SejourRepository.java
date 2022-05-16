package com.hopital.patientms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.patientms.model.Sejour;

@Repository
public interface SejourRepository extends JpaRepository<Sejour, Long> {

}
