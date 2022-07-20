package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Intervenant;

public interface intervenantRepo extends CrudRepository<Intervenant, Long>{

	boolean existsByCodeIntervenant(String codeIntervenant);

}
