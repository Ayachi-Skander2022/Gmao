package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Intervenant;

public interface IIntervenantService {
	public Intervenant addIntervenant(Intervenant intervenant);
	public String addIntervenantTestCode(Intervenant intervenant);
	public Intervenant updateIntervenant(Intervenant intervenant, Long idIntervenant);
	public void deleteIntervenant (Long idIntervenant);
	public List<Intervenant> findAll();
}
