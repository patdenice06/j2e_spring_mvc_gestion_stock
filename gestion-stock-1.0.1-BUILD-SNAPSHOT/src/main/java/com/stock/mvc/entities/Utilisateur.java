package com.stock.mvc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable{
	private static final long serialVersionUID = 3034893033866090267L;
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idUtilisateur;
	
	private String nom;	
	private String prenom;	
	private String mail;	
	private String motDePasse;	// Pour se connnecter à l'application	
	private String photo;
	
	// Default ctor
	public Utilisateur() {
		super();
	}

	
	// Getters and Setters
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	
	
}
