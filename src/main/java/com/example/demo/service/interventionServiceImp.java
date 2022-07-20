package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Intervention;
import com.example.demo.repository.interventionRepo;

@Service
public class interventionServiceImp implements IInterventionService{

	@Autowired
	interventionRepo ir;

	@Override
	public Intervention addIntervention(Intervention intervention) {
		// TODO Auto-generated method stub
		return ir.save(intervention);
	}

	@Override
	public String addInterventionTestCode(Intervention intervention) {
		String msg="";
	     if(ir.existsByCodeIntervention(intervention.getCodeIntervention())) {
	    	 msg="Intervention existe déjat!!";
	     }
	     else {
	    	 ir.save(intervention);
	    	 msg="Intervention ajouté avec succés";
	     }
			return msg;
	}

	@Override
	public Intervention updateIntervention(Intervention intervention, Long idIntervention) {
		 Intervention i =ir.findById(idIntervention).get();
	        
	        i.setCodeIntervention(intervention.getCodeIntervention());
	        i.setCodeIntervenant(intervention.getCodeIntervenant());
	        i.setCodeMachine(intervention.getCodeMachine());
	        i.setCodeArticle(intervention.getCodeArticle());
	        i.setDateIntervention(intervention.getDateIntervention());
	        i.setDureeIntervention(intervention.getDureeIntervention());
			return ir.save(i);
	}

	@Override
	public void deleteIntervention(Long idIntervention) {
		ir.deleteById(idIntervention);
	}

	@Override
	public List<Intervention> findAll() {
		// TODO Auto-generated method stub
		return (List<Intervention>) ir.findAll();
	}
	
		
}
