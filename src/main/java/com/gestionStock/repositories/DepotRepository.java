package com.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionStock.models.Depot;


@Repository
public interface DepotRepository extends JpaRepository<Depot, Long> {

}
