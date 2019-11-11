package com.stock.mvc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneVente implements Serializable{
	private static final long serialVersionUID = -1778677051330775801L;
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idLigneVente;
	
	@ManyToOne
	@JoinColumn(name="idVente")
	private Vente vente;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	
	// Default ctor
	public LigneVente() {
		super();
	}

	
	// Getters and Setters
	public Vente getVente() {
		return vente;
	}


	public void setVente(Vente vente) {
		this.vente = vente;
	}


	public Article getArticle() {
		return article;
	}


	public void setArticle(Article article) {
		this.article = article;
	}


	public Long getIdLigneVente() {
		return idLigneVente;
	}

	
	
	
	
}
