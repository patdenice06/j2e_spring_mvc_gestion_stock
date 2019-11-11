package com.stock.mvc.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MouvementStock implements Serializable{
	private static final long serialVersionUID = 6281782294840675368L;
	
	// Utilisées lors de l'insertion des données dans la base 
	public static final int ENTREE = 1;	
	public static final int SORTIE = 2;	
	
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idMouvementStock;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	
	private BigDecimal quantite;	
	private int typeMvtStk;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	
	// Default ctor
	public MouvementStock() {
		super();
	}


	// Getters and Setters
	public Date getDateMvt() {
		return dateMvt;
	}


	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}


	public BigDecimal getQuantite() {
		return quantite;
	}


	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}


	public Article getArticle() {
		return article;
	}


	public void setArticle(Article article) {
		this.article = article;
	}


	public Long getIdMouvementStock() {
		return idMouvementStock;
	}


	public int getTypeMvtStk() {
		return typeMvtStk;
	}


	public void setTypeMvtStk(int typeMvtStk) {
		this.typeMvtStk = typeMvtStk;
	}
	
}
