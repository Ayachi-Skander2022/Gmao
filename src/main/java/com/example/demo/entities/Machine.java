package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Machine implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Long idMachine;
	  private String codeMachine;
	  private Double coutImmobilisation;
	  private String compteur;
	  private String typeMachine;
	  private String secteur;
	public Machine(Long idMachine, String codeMachine, Double coutImmobilisation, String compteur, String typeMachine,
			String secteur) {
		super();
		this.idMachine = idMachine;
		this.codeMachine = codeMachine;
		this.coutImmobilisation = coutImmobilisation;
		this.compteur = compteur;
		this.typeMachine = typeMachine;
		this.secteur = secteur;
	}
	public Machine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdMachine() {
		return idMachine;
	}
	public void setIdMachine(Long idMachine) {
		this.idMachine = idMachine;
	}
	public String getCodeMachine() {
		return codeMachine;
	}
	public void setCodeMachine(String codeMachine) {
		this.codeMachine = codeMachine;
	}
	public Double getCoutImmobilisation() {
		return coutImmobilisation;
	}
	public void setCoutImmobilisation(Double coutImmobilisation) {
		this.coutImmobilisation = coutImmobilisation;
	}
	public String getCompteur() {
		return compteur;
	}
	public void setCompteur(String compteur) {
		this.compteur = compteur;
	}
	public String getTypeMachine() {
		return typeMachine;
	}
	public void setTypeMachine(String typeMachine) {
		this.typeMachine = typeMachine;
	}
	public String getSecteur() {
		return secteur;
	}
	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codeMachine, compteur, coutImmobilisation, idMachine, secteur, typeMachine);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Machine other = (Machine) obj;
		return Objects.equals(codeMachine, other.codeMachine) && Objects.equals(compteur, other.compteur)
				&& Objects.equals(coutImmobilisation, other.coutImmobilisation)
				&& Objects.equals(idMachine, other.idMachine) && Objects.equals(secteur, other.secteur)
				&& Objects.equals(typeMachine, other.typeMachine);
	}
	@Override
	public String toString() {
		return "Machine [idMachine=" + idMachine + ", codeMachine=" + codeMachine + ", coutImmobilisation="
				+ coutImmobilisation + ", compteur=" + compteur + ", typeMachine=" + typeMachine + ", secteur="
				+ secteur + "]";
	}
	  
	  
}
