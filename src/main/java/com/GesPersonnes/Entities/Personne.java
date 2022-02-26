package com.GesPersonnes.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="personne")
public class Personne implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CIN;
    private Long numTel;
    private String nom;
    private String prenom;
    private String adresse;
    private Date dateNai;
    private String email;
	public Long getCIN() {
		return CIN;
	}
	public void setCIN(Long cIN) {
		CIN = cIN;
	}
	public Long getNumTel() {
		return numTel;
	}
	public void setNumTel(Long numTel) {
		this.numTel = numTel;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDateNai() {
		return dateNai;
	}
	public void setDateNai(Date dateNai) {
		this.dateNai = dateNai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    
}
