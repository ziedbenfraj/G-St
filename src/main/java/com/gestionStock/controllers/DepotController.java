package com.gestionStock.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionStock.models.Article;
import com.gestionStock.models.Depot;
import com.gestionStock.services.ArticleService;
import com.gestionStock.services.DepotService;

@RestController
@RequestMapping("/depot")
public class DepotController {
	@Autowired
	private DepotService depotService;
	
	@GetMapping
	public List<Depot> getAll() {
		return depotService.findAll();
	}
	
	@PostMapping
	public Depot create(@RequestBody Depot depot) {
		return depotService.create(depot);
	}

}
