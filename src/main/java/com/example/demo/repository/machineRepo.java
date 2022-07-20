package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Machine;

@Repository
public interface machineRepo extends CrudRepository<Machine, Long>{

	boolean existsByCodeMachine(String codeMachine);


}
