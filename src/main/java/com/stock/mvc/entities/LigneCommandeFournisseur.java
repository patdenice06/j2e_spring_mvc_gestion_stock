package com.stock.mvc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeFournisseur implements Serializable{
	private static final long serialVersionUID = -4588446538957768867L;
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idLigneCommandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	
	// Default ctor
	public LigneCommandeFournisseur() {
		super();
	}

	
	// Getters and Setters
	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}
	
	

}
