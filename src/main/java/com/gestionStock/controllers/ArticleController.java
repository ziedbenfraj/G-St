package com.gestionStock.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionStock.models.Article;
import com.gestionStock.services.ArticleService;



@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping
	public List<Article> getAll() {
		return articleService.findAll();
	}
	
	@PostMapping
	public Article create(@RequestBody Article article) {
		return articleService.create(article);
	}


}
