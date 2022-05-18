package com.hopital.patientms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nom")
	private String name;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "adresse")
	private String adresse;

    @Column(name = "code_postal")
	private String codePostal;

    @Column(name = "ville")
	private String ville;
	
	@Column(name = "sexe")
	private String sexe;
	
	@Column(name = "age")
	private Long age;

    @Column(name = "date_naissance")
	private Date dateNaissance;
	
	@Column(name = "numero_secu")
	private Long numSecu;

    public Patient(Long id, String name, String prenom, String telephone, String adresse, String codePostal, String ville, String sexe, Long age, Date dateNaissance,
            Long numSecu) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.sexe = sexe;
        this.age = age;
        this.dateNaissance = dateNaissance;
        this.numSecu = numSecu;
    }

    public Patient() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Long getAge() {
        return age;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(Long numSecu) {
        this.numSecu = numSecu;
    }
}
