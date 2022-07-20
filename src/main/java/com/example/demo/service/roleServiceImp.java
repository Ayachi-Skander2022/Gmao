package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Role;
import com.example.demo.repository.roleRepo;
@Service
public class roleServiceImp implements IRoleService{

	@Autowired
	roleRepo rr;
	@Override
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		return rr.save(role);
	}

}
