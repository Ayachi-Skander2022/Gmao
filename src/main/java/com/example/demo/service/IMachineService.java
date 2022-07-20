package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Machine;

public interface IMachineService {
	public Machine addMachine(Machine machine);
	public String addMachineTestCode(Machine machine);
	public Machine updateMachine(Machine machine, Long idMachine);
	public void deleteMachine (Long idMachine);
	public List<Machine> findAll();
}
