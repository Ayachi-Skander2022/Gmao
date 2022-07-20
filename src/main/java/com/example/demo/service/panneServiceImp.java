package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Panne;
import com.example.demo.repository.panneRepo;
@Service
public class panneServiceImp implements IPanneService{
	@Autowired
	panneRepo pr;
	@Override
	public Panne addPanne(Panne panne) {
		// TODO Auto-generated method stub
		return pr.save(panne);
	}
	@Override
	public String addPanneTestCode(Panne panne) {
		String msg="";
	     if(pr.existsByCodePanne(panne.getCodePanne())) {
	    	 msg="Pannne existe déjat!!";
	     }
	     else {
	    	 pr.save(panne);
	    	 msg="Panne ajouté avec succés";
	     }
			return msg;
	}
	@Override
	public Panne updatePanne(Panne panne, Long idPanne) {
		 Panne p=pr.findById(idPanne).get();
	        
	      p.setStatus(panne.getStatus());
	        
			return pr.save(p);
	}
	@Override
	public void deletePanne(Long idPanne) {
      pr.existsById(idPanne);		
	}
	@Override
	public List<Panne> findAll() {
		// TODO Auto-generated method stub
		return (List<Panne>) pr.findAll();
	}

}
