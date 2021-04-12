	package com.gestionStock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.gestionStock.controllers.ArticleController;
import com.gestionStock.models.Article;
import com.gestionStock.repositories.ArticleRepository;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {

	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		
	}

	
	
	
	
}
