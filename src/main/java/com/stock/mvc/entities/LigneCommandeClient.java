package com.stock.mvc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeClient implements Serializable{
	private static final long serialVersionUID = -8919331531817873254L;
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idLigneCommandeClient;
	
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private CommandeClient commandeClient;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;


	// Default ctor
	public LigneCommandeClient() {
		super();
	}

	
	// Getters and Setters
	public CommandeClient getCommandeClient() {
		return commandeClient;
	}


	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}


	public Article getArticle() {
		return article;
	}


	public void setArticle(Article article) {
		this.article = article;
	}


	public Long getIdLigneCommandeClient() {
		return idLigneCommandeClient;
	}

	
	
	

}
