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

import com.example.demo.entities.Intervention;
import com.example.demo.service.IInterventionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/intervention")
public class interventionController {
	@Autowired
	
	IInterventionService interventionService;
	
	@PostMapping("/addIntervention")
	public Intervention addIntervention(@RequestBody Intervention intervention) {
		return interventionService.addIntervention(intervention);
	}
	
	@PostMapping("/addTestCode")
	   public String addTestCode (@RequestBody Intervention intervention) {
		return interventionService.addInterventionTestCode(intervention);
	}
	
	@PutMapping("/updateIntervention/{id}")
	  public Intervention updateIntervention(@RequestBody Intervention intervention,@PathVariable("id") Long idIntervention) {
	  	return interventionService.updateIntervention(intervention, idIntervention);
	  }
	
	 @DeleteMapping("/deleteIntervention/{id}")
	  public String deleteIntervention(@PathVariable("id") Long idIntervention) {
	  	String msg="";
	  	interventionService.deleteIntervention(idIntervention);
	  	return msg;
	  }
	 
	 @GetMapping("/findAllIntervention")
	  public List<Intervention> findAll(){
	  	return interventionService.findAll();
	  }
	  
}
