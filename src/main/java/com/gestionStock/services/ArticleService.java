package com.gestionStock.services;

import java.util.List;
import com.gestionStock.models.Article;


public interface ArticleService {

	List<com.gestionStock.models.Article> findAll();

	Article findById(Long id);

	Article create(Article article);

	Article update(Article article);

	void delete(Long id);
	
		
}
