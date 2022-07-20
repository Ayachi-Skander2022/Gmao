package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Intervention implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idIntervention;
	private String codeIntervention;
	private String codeMachine;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateIntervention;
	private String typeDefaut;
	private String typeMaintenance;
	private String codeArticle;
	private Double  dureeIntervention;
	private String codeIntervenant;
	public Intervention() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Intervention(Long idIntervention, String codeIntervention, String codeMachine, Date dateIntervention,
			String typeDefaut, String typeMaintenance, String codeArticle, Double dureeIntervention,
			String codeIntervenant) {
		super();
		this.idIntervention = idIntervention;
		this.codeIntervention = codeIntervention;
		this.codeMachine = codeMachine;
		this.dateIntervention = dateIntervention;
		this.typeDefaut = typeDefaut;
		this.typeMaintenance = typeMaintenance;
		this.codeArticle = codeArticle;
		this.dureeIntervention = dureeIntervention;
		this.codeIntervenant = codeIntervenant;
	}
	public Long getIdIntervention() {
		return idIntervention;
	}
	public void setIdIntervention(Long idIntervention) {
		this.idIntervention = idIntervention;
	}
	public String getCodeIntervention() {
		return codeIntervention;
	}
	public void setCodeIntervention(String codeIntervention) {
		this.codeIntervention = codeIntervention;
	}
	public String getCodeMachine() {
		return codeMachine;
	}
	public void setCodeMachine(String codeMachine) {
		this.codeMachine = codeMachine;
	}
	public Date getDateIntervention() {
		return dateIntervention;
	}
	public void setDateIntervention(Date dateIntervention) {
		this.dateIntervention = dateIntervention;
	}
	public String getTypeDefaut() {
		return typeDefaut;
	}
	public void setTypeDefaut(String typeDefaut) {
		this.typeDefaut = typeDefaut;
	}
	public String getTypeMaintenance() {
		return typeMaintenance;
	}
	public void setTypeMaintenance(String typeMaintenance) {
		this.typeMaintenance = typeMaintenance;
	}
	public String getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}
	public Double getDureeIntervention() {
		return dureeIntervention;
	}
	public void setDureeIntervention(Double dureeIntervention) {
		this.dureeIntervention = dureeIntervention;
	}
	public String getCodeIntervenant() {
		return codeIntervenant;
	}
	public void setCodeIntervenant(String codeIntervenant) {
		this.codeIntervenant = codeIntervenant;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codeArticle, codeIntervenant, codeIntervention, codeMachine, dateIntervention,
				dureeIntervention, idIntervention, typeDefaut, typeMaintenance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Intervention other = (Intervention) obj;
		return Objects.equals(codeArticle, other.codeArticle) && Objects.equals(codeIntervenant, other.codeIntervenant)
				&& Objects.equals(codeIntervention, other.codeIntervention)
				&& Objects.equals(codeMachine, other.codeMachine)
				&& Objects.equals(dateIntervention, other.dateIntervention)
				&& Objects.equals(dureeIntervention, other.dureeIntervention)
				&& Objects.equals(idIntervention, other.idIntervention) && Objects.equals(typeDefaut, other.typeDefaut)
				&& Objects.equals(typeMaintenance, other.typeMaintenance);
	}
	@Override
	public String toString() {
		return "Intervention [idIntervention=" + idIntervention + ", codeIntervention=" + codeIntervention
				+ ", codeMachine=" + codeMachine + ", dateIntervention=" + dateIntervention + ", typeDefaut="
				+ typeDefaut + ", typeMaintenance=" + typeMaintenance + ", codeArticle=" + codeArticle
				+ ", dureeIntervention=" + dureeIntervention + ", codeIntervenant=" + codeIntervenant + "]";
	}
	
	
}
