package com.gestionStock.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Stock")
public class Stock {
	
	@Id
	private Long idStock;
	
	@Column(unique = true)
	private int qte;
	
	@Column
	private String datePeremption;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idArticle", foreignKey = @ForeignKey(name = "FK_Article"))
	private  Article article;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idDepot", foreignKey = @ForeignKey(name = "FK_Depot"))
	private  Depot depot;
	
	
	/*
	 * Getters && Setters  
	 **/

	public Long getIdStock() {
		return idStock;
	}

	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public String getDatePeremption() {
		return datePeremption;
	}

	public void setDatePeremption(String datePeremption) {
		this.datePeremption = datePeremption;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Depot getDepot() {
		return depot;
	}

	public void setDepot(Depot depot) {
		this.depot = depot;
	}

	public Stock(Long idStock, int qte, String datePeremption, Article article, Depot depot) {
		super();
		this.idStock = idStock;
		this.qte = qte;
		this.datePeremption = datePeremption;
		this.article = article;
		this.depot = depot;
	}

	public Stock() {
		super();
	}
	
	
	
	

}
