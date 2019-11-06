package com.stock.mvc.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vente implements Serializable{
	private static final long serialVersionUID = 4542486313159393572L;
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idVente;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente;
	
	@OneToMany(mappedBy="vente")
	List<LigneVente> ligneVentes;

	
	// Default ctor
	public Vente() {
		super();
	}


	// Getters and Setters
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public Date getDateVente() {
		return dateVente;
	}


	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}


	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}


	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}


	public Long getIdVente() {
		return idVente;
	}

	
	
}
