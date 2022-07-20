package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Machine;
import com.example.demo.repository.machineRepo;
@Service
public class machineServiceImp implements IMachineService{
@Autowired
machineRepo mr;
	@Override
	public Machine addMachine(Machine machine) {
		// TODO Auto-generated method stub
		return mr.save(machine);
	}
	
	@Override
	public String addMachineTestCode(Machine machine) {

		String msg="";
     if(mr.existsByCodeMachine(machine.getCodeMachine())) {
    	 msg="Machine existe déjat!!";
     }
     else {
    	 mr.save(machine);
    	 msg="Machine ajouté avec succés";
     }
		return msg;
			
	}

	@Override
	public Machine updateMachine(Machine machine, Long idMachine) {
		 Machine m=mr.findById(idMachine).get();
	        
	        m.setCodeMachine(machine.getCodeMachine());
	        m.setCompteur(machine.getCompteur());
	        m.setTypeMachine(machine.getTypeMachine());
	        m.setSecteur(machine.getSecteur());
	        m.setCoutImmobilisation(machine.getCoutImmobilisation());
	        
			return mr.save(m);
	}

	@Override
	public void deleteMachine(Long idMachine) {
		// TODO Auto-generated method stub
		mr.deleteById(idMachine);
	}

	@Override
	public List<Machine> findAll() {
		// TODO Auto-generated method stub
		return (List<Machine>) mr.findAll();
	}
	

}
