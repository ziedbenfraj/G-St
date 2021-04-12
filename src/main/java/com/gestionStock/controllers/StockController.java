package com.gestionStock.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionStock.models.Article;
import com.gestionStock.models.Stock;
import com.gestionStock.services.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {
	@Autowired
	private StockService stockService;

	@GetMapping
	public List<Stock> getAll() {
		return stockService.findAll();
	}
	
	@GetMapping("/{id}")
	public List<Stock> getByArticleID(Long id) {
		return stockService.getByArticle(id);
	}
}
