package com.gestionStock.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Depot")
public class Depot {
	
	@Id
	private Long idDepot;
	
	@Column(unique = true)
	private String nomDepot;

	/*
	 * Getters && Setters  
	 **/
	
	public Long getIdDepot() {
		return idDepot;
	}

	public void setIdDepot(Long idDepot) {
		this.idDepot = idDepot;
	}

	public String getNomDepot() {
		return nomDepot;
	}

	public void setNomDepot(String nomDepot) {
		this.nomDepot = nomDepot;
	}

	public Depot(Long idDepot, String nomDepot) {
		super();
		this.idDepot = idDepot;
		this.nomDepot = nomDepot;
	}

	public Depot() {
		super();
	}

	public Depot(Long idDepot) {
		super();
		this.idDepot = idDepot;
	}
	
	
	
	
	

}
