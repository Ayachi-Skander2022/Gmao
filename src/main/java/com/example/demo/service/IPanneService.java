package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Panne;

public interface IPanneService {
	public Panne addPanne(Panne panne);
	public String addPanneTestCode(Panne panne);
	public Panne updatePanne(Panne panne, Long idPanne);
	public void deletePanne (Long idPanne);
	public List<Panne> findAll();
}
