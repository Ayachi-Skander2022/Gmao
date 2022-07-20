package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Intervenant;
import com.example.demo.repository.intervenantRepo;
@Service
public class intervenantServiceImp implements IIntervenantService {

	@Autowired
	intervenantRepo inr;

	@Override
	public Intervenant addIntervenant(Intervenant intervenant) {
		// TODO Auto-generated method stub
		return inr.save(intervenant);
	}

	@Override
	public String addIntervenantTestCode(Intervenant intervenant) {
		String msg="";
	     if(inr.existsByCodeIntervenant(intervenant.getCodeIntervenant())) {
	    	 msg="Intervenant existe déjat!!";
	     }
	     else {
	    	 inr.save(intervenant);
	    	 msg="Intervenant ajouté avec succés";
	     }
			return msg; 
	}

	@Override
	public Intervenant updateIntervenant(Intervenant intervenant, Long idIntervenant) {
		Intervenant i =inr.findById(idIntervenant).get();
        
        i.setCodeIntervenant(intervenant.getCodeIntervenant());
        i.setCoutH(intervenant.getCoutH());
        i.setFonction(intervenant.getFonction());
        i.setNom(intervenant.getNom());
        i.setPrenom(intervenant.getPrenom());
        i.setNumTel(intervenant.getNumTel());
        i.setType(intervenant.getType());
        i.setService(intervenant.getService());
		return inr.save(i);
	}

	@Override
	public void deleteIntervenant(Long idIntervenant) {
		inr.deleteById(idIntervenant);
		
	}

	@Override
	public List<Intervenant> findAll() {
		// TODO Auto-generated method stub
		return (List<Intervenant>) inr.findAll();
	}

}
