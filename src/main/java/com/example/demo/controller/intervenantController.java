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

import com.example.demo.entities.Intervenant;
import com.example.demo.service.IIntervenantService;

@RestController
@RequestMapping("/intervenant")
@CrossOrigin(origins = "http://localhost:4200")
public class intervenantController {
	@Autowired
	IIntervenantService intervenantService;
	
	@PostMapping("/addIntervenant")
	public Intervenant addArticle(@RequestBody Intervenant intervenant) {
		return intervenantService.addIntervenant(intervenant);
	}
	
	@PostMapping("/addTestCode")
	   public String addTestCode (@RequestBody Intervenant intervenant) {
		return intervenantService.addIntervenantTestCode(intervenant);
	}
	
	@PutMapping("/updateIntervenant/{id}")
	  public Intervenant updateIntervenant(@RequestBody Intervenant intervenant,@PathVariable("id") Long idIntervenant) {
	  	return intervenantService.updateIntervenant(intervenant, idIntervenant);
	  }
	
	 @DeleteMapping("/deleteIntervenant/{id}")
	  public String deleteIntervenant(@PathVariable("id") Long idIntervenant) {
	  	String msg="";
	  	intervenantService.deleteIntervenant(idIntervenant);
	  	return msg;
	  }
	 @GetMapping("/findAllIntervenant")
	  public List<Intervenant> findAll(){
	  	return intervenantService.findAll();
	  }
}
