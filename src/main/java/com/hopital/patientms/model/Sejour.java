package com.hopital.patientms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sejour")
public class Sejour implements Serializable{
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "date_debut")
	private Date dateDebut;
	
	@Column(name = "date_fin")
	private Date dateFin;
	
	@Column(name = "cause")
	private String cause;

    @Column(name = "id_lit")
    private Long litId;

    @OneToOne
	@JoinColumn(name="id_patient")
	private Patient patient;

    public Sejour(Long id, Date dateDebut, Date dateFin, String cause, Long litId, Patient patient) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.cause = cause;
        this.litId = litId;
        this.patient = patient;
    }

    public Sejour() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Long getLitId() {
        return litId;
    }

    public void setLitId(Long litId) {
        this.litId = litId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
