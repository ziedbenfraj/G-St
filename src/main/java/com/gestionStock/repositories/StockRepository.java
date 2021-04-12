package com.gestionStock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gestionStock.models.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
	
	@Query(value = "SELECT * FROM Stock WHERE article.idArticle=id1", nativeQuery = true)
	List<Stock> getByArticle(@Param("id") Long id);
}
