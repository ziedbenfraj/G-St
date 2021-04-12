package com.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionStock.models.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

}
