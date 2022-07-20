package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Intervenant implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idIntervenant;
	private String codeIntervenant;
	private String nom;
	private String prenom;
	private String numTel;
	private String fonction;
	private String service;
	private String coutH;
	private String type;
	public Intervenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Intervenant(Long idIntervenant, String codeIntervenant, String nom, String prenom, String numTel,
			String fonction, String service, String coutH, String type) {
		super();
		this.idIntervenant = idIntervenant;
		this.codeIntervenant = codeIntervenant;
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.fonction = fonction;
		this.service = service;
		this.coutH = coutH;
		this.type = type;
	}
	public Long getIdIntervenant() {
		return idIntervenant;
	}
	public void setIdIntervenant(Long idIntervenant) {
		this.idIntervenant = idIntervenant;
	}
	public String getCodeIntervenant() {
		return codeIntervenant;
	}
	public void setCodeIntervenant(String codeIntervenant) {
		this.codeIntervenant = codeIntervenant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getCoutH() {
		return coutH;
	}
	public void setCoutH(String coutH) {
		this.coutH = coutH;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codeIntervenant, coutH, fonction, idIntervenant, nom, numTel, prenom, service, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Intervenant other = (Intervenant) obj;
		return Objects.equals(codeIntervenant, other.codeIntervenant) && Objects.equals(coutH, other.coutH)
				&& Objects.equals(fonction, other.fonction) && Objects.equals(idIntervenant, other.idIntervenant)
				&& Objects.equals(nom, other.nom) && Objects.equals(numTel, other.numTel)
				&& Objects.equals(prenom, other.prenom) && Objects.equals(service, other.service)
				&& Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "Intervenant [idIntervenant=" + idIntervenant + ", codeIntervenant=" + codeIntervenant + ", nom=" + nom
				+ ", prenom=" + prenom + ", numTel=" + numTel + ", fonction=" + fonction + ", service=" + service
				+ ", coutH=" + coutH + ", type=" + type + "]";
	}
	
	
}
