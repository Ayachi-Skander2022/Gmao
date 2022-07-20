package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Intervention;

public interface IInterventionService {
	public Intervention addIntervention(Intervention intervention);
	public String addInterventionTestCode(Intervention intervention);
	public Intervention updateIntervention(Intervention intervention, Long idIntervention);
	public void deleteIntervention (Long idIntervention);
	public List<Intervention> findAll();
}
