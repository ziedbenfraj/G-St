package com.gestionStock.services;

import java.util.List;

import com.gestionStock.models.Depot;
import com.gestionStock.models.Stock;

public interface StockService {
	List<Stock> findAll();

	Stock findById(Long id);

	Stock create(Stock stock);

	Depot update(Stock stock);

	void delete(Long id);
	
	List<Stock> getByArticle(Long id);
}
