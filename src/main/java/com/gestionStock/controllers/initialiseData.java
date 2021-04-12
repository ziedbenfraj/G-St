package com.gestionStock.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionStock.models.Article;
import com.gestionStock.models.Depot;
import com.gestionStock.models.Stock;
import com.gestionStock.services.ArticleService;
import com.gestionStock.services.DepotService;
import com.gestionStock.services.StockService;

@RestController
@RequestMapping("")
public class initialiseData {
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private DepotService depotService;
	
	@Autowired
	private StockService stockService;
	
	@GetMapping
	public void save() {
		// save the article
		Article article1=new Article((long) 1,"DOLIPRANE 1000mg");
		Article article2=new Article((long) 2,"DOLVEN 400mg");
		articleService.create(article1);
		articleService.create(article2);
		//save the depot
		Depot depot1= new Depot((long)1, "BLOC CENTRALE");
		Depot depot2= new Depot((long)2, "URGENCE");
		depotService.create(depot1);
		depotService.create(depot2);
		// save stock
		Depot depot=new Depot();
		depot.setIdDepot((long) 1);
		Article article=new Article();
		article.setIdArticle((long) 1);
		// stock 1
		Stock stock1=new Stock( (long) 1, 5, "05/08/2024",article,depot);
		stockService.create(stock1);
		// stock 2
		Stock stock2=new Stock( (long) 2, 3, "05/02/2022",article,depot);
		stockService.create(stock2);
		// stock 3
		Stock stock3=new Stock( (long) 3, 7, "17/12/2021",article,depot);
		stockService.create(stock3);
		// stock 4
		depot.setIdDepot((long) 2);
		Stock stock4=new Stock( (long) 4, 15, "05/08/2021",article,depot);
		stockService.create(stock4);
		// stock 5
		Stock stock5=new Stock( (long) 5, 4, "22/06/2022",article,depot);
		stockService.create(stock5);
		// stock 6
		depot.setIdDepot((long) 1);
		article.setIdArticle((long) 2);
		Stock stock6=new Stock( (long) 6, 6, "11/08/2022",article,depot);
		stockService.create(stock5);
	}
}
