package com.gestionStock.servicesImpliment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionStock.models.Depot;
import com.gestionStock.models.Stock;
import com.gestionStock.repositories.DepotRepository;
import com.gestionStock.repositories.StockRepository;
import com.gestionStock.services.StockService;


@Service
public class StockServiceImpl  implements StockService{
	@Autowired
	private StockRepository stockRepository;
	
	@Override
	public List<Stock> findAll() {
		return stockRepository.findAll();
	}

	@Override
	public Stock findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock create(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public Depot update(Stock stock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Stock> getByArticle(Long id) {
		
		return stockRepository.getByArticle(id);
	}

}
