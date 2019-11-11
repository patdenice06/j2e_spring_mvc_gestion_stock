package com.stock.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
	private static final long serialVersionUID = 4711865962936877925L;
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idClient;
	
	private String nom;
	private String prenom;
	private String adresse;
	private String photo;
	private String mail;
	
	@OneToMany(mappedBy="client")
	private List<CommandeClient> commandeClients;
	

	// Default ctor
	public Client() {
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Long getIdClient() {
		return idClient;
	}
	public List<CommandeClient> getCommandeClients() {
		return commandeClients;
	}
	public void setCommandeClients(List<CommandeClient> commandeClients) {
		this.commandeClients = commandeClients;
	}



}
