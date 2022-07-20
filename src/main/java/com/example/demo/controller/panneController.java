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

import com.example.demo.entities.Panne;
import com.example.demo.service.IPanneService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/panne")

public class panneController {
@Autowired
	
	IPanneService panneService;

@PostMapping("/addPanne")
public Panne addPanne(@RequestBody Panne panne) {
	return panneService.addPanne(panne);
}

@PostMapping("/addTestCode")
 public String addTestCode (@RequestBody Panne panne) {
	return panneService.addPanneTestCode(panne);
}

@PutMapping("/updatePanne/{id}")
public Panne updatePanne(@RequestBody Panne panne,@PathVariable("id") Long idPanne) {
	return panneService.updatePanne(panne, idPanne);

}


@DeleteMapping("/deletePanne/{id}")
public String deletePanne(@PathVariable("id") Long idPanne) {
	String msg="";
	panneService.deletePanne(idPanne);
	return msg;
}

@GetMapping("/findAllPanne")
public List<Panne> findAll(){
	return panneService.findAll();
}


}
