package com.gestionStock.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Article")
public class Article {
	
	@Id
	private Long idArticle;
	
	@Column(unique = true)
	private String designation_article;

	/*
	 * Getters && Setters  
	 **/
	
	public Long getIdArticle() {
		return idArticle;
	}


	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}


	public String getDesignation_article() {
		return designation_article;
	}


	public void setDesignation_article(String designation_article) {
		this.designation_article = designation_article;
	}


	public Article(Long idArticle, String designation_article) {
		super();
		this.idArticle = idArticle;
		this.designation_article = designation_article;
	}


	public Article() {
		super();
	}


	public Article(Long idArticle) {
		super();
		this.idArticle = idArticle;
	}


	
	
	

}
