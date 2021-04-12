package com.gestionStock.servicesImpliment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionStock.models.Depot;
import com.gestionStock.repositories.DepotRepository;
import com.gestionStock.services.DepotService;


@Service
public class DepotServiceImpl  implements DepotService{
	
	@Autowired
	private DepotRepository depotRepository;

	@Override
	public List<Depot> findAll() {
		return depotRepository.findAll();
	}

	@Override
	public Depot findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Depot create(Depot depot) {
		return depotRepository.save(depot);
	}

	@Override
	public Depot update(Depot depot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
