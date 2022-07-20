package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Panne;
@Repository
public interface panneRepo extends CrudRepository<Panne, Long>{

	boolean existsByCodePanne(String codePanne);

}
