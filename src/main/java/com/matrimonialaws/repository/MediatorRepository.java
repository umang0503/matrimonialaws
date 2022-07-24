package com.matrimonialaws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimonialaws.entities.Mediator;

@Repository
public interface MediatorRepository extends JpaRepository<Mediator,Long>{
	
}
