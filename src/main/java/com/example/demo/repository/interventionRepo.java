package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Intervention;

@Repository
public interface interventionRepo extends CrudRepository<Intervention, Long>{

	boolean existsByCodeIntervention(String codeIntervention);
  
}
