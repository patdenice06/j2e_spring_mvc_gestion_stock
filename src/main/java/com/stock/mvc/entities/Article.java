package com.stock.mvc.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Article implements Serializable{	
	private static final long serialVersionUID = 2534718044635554702L;
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idArticle;

	private String codeArticle;
	private String designation;
	private BigDecimal prixUnitaireHT;
	private BigDecimal tauxTva;
	private BigDecimal prixUnitaireTTC;
	private String photo;
	
	// Un article appartient à une catégorie
	// Dans une catégorie on peut avoir plusieurs articles
	@ManyToOne // Plusieurs articles dans une catégorie
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	
	@OneToMany(mappedBy="article")
	private List<LigneCommandeClient> ligneCommandeClients;
	
	@OneToMany(mappedBy="article")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
	
	@OneToMany(mappedBy="article")
	private List<MouvementStock> mouvementStocks;
	
	@OneToMany(mappedBy="article")
	private List<LigneVente> ligneVentes;
	
	
	// Default ctor
	public Article() {
		super();
	}


	// Getters and Setters
	public String getCodeArticle() {
		return codeArticle;
	}


	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}


	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}


	public BigDecimal getTauxTva() {
		return tauxTva;
	}


	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}


	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}


	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public List<LigneCommandeClient> getLigneCommandeClients() {
		return ligneCommandeClients;
	}


	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}


	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}


	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}


	public List<MouvementStock> getMouvementStocks() {
		return mouvementStocks;
	}


	public void setMouvementStocks(List<MouvementStock> mouvementStocks) {
		this.mouvementStocks = mouvementStocks;
	}


	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}


	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}


	public Long getIdArticle() {
		return idArticle;
	}
	
	
}
