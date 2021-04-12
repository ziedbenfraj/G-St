package com.gestionStock.services;

import java.util.List;

import com.gestionStock.models.Depot;

public interface DepotService {
	List<Depot> findAll();

	Depot findById(Long id);

	Depot create(Depot depot);

	Depot update(Depot depot);

	void delete(Long id);
}
