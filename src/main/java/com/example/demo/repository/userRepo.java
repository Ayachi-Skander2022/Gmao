package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;
@Repository
public interface userRepo extends CrudRepository<User, Long>{

	boolean existsByEmail(String email);

   
}
