package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Machine;
import com.example.demo.service.IMachineService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/machine")
public class machineController {
	@Autowired
	
	IMachineService machineService;
	
	@PostMapping("/addMachine")
	public Machine addArticle(@RequestBody Machine machine) {
		return machineService.addMachine(machine);
	}
	

  @PostMapping("/addTestCode")
   public String addTestCode (@RequestBody Machine machine) {
	return machineService.addMachineTestCode(machine);
}
  
  @PutMapping("/updateMachine/{id}")
  public Machine updateMachine(@RequestBody Machine machine,@PathVariable("id") Long idMachine) {
  	return machineService.updateMachine(machine, idMachine);
  }
  
  @DeleteMapping("/deleteMachine/{id}")
  public String deleteMachine(@PathVariable("id") Long idMachine) {
  	String msg="";
  	machineService.deleteMachine(idMachine);
  	return msg;
  }
  
  @GetMapping("/findAllMachine")
  public List<Machine> findAll(){
  	return machineService.findAll();
  }

}
