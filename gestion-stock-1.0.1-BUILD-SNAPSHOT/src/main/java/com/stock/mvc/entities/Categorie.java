package com.stock.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable{
	private static final long serialVersionUID = -4222373474791297135L;
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCategorie;

	private String code;
	private String designation;
	// Une catégorie contient 0 ou  plusieurs articles
	@OneToMany(mappedBy="categorie")
	private List<Article> articles;
	
	
	// Default ctor
	public Categorie() {
		super();
	}
	
	
	// Getters and Setters
	public Long getIdCategorie() {
		return idCategorie;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	
}
