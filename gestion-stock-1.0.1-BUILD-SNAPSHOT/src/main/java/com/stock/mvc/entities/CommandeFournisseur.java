package com.stock.mvc.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CommandeFournisseur implements Serializable{
	private static final long serialVersionUID = 4445179646289701936L;
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCommandeFournisseur;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur;

	@OneToMany(mappedBy="commandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

	
	// Default ctor
	public CommandeFournisseur() {
		super();
	}


	// Getters and Setters
	public Date getDateCommande() {
		return dateCommande;
	}


	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}


	public Fournisseur getFournisseur() {
		return fournisseur;
	}


	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}


	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}


	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}


	public Long getIdCommandeFournisseur() {
		return idCommandeFournisseur;
	}
	
	
}
