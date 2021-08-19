package com.example.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flight.entity.ManageFlightEntity;

@Repository
public interface ManageFlightRepo extends JpaRepository<ManageFlightEntity, Integer>{

	
}
