package com.hopital.patientms.exception;

public class PatientNotFoundException extends RuntimeException {
  
  private static final long serialVersionUID = 1L;
  
  public PatientNotFoundException(Long id) {
    super("Le patient avec l'id " + id + " n'existe pas.");
  }   
}
