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
public class Panne implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPanne;
	private String codePanne;
	private String codeMachine;//joint
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date datePanne;
	private String description;
	private String status;
	public Panne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Panne(Long idPanne, String codePanne, String codeMachine, Date datePanne, String description,
			String status) {
		super();
		this.idPanne = idPanne;
		this.codePanne = codePanne;
		this.codeMachine = codeMachine;
		this.datePanne = datePanne;
		this.description = description;
		this.status = status;
	}
	public Long getIdPanne() {
		return idPanne;
	}
	public void setIdPanne(Long idPanne) {
		this.idPanne = idPanne;
	}
	public String getCodePanne() {
		return codePanne;
	}
	public void setCodePanne(String codePanne) {
		this.codePanne = codePanne;
	}
	public String getCodeMachine() {
		return codeMachine;
	}
	public void setCodeMachine(String codeMachine) {
		this.codeMachine = codeMachine;
	}
	public Date getDatePanne() {
		return datePanne;
	}
	public void setDatePanne(Date datePanne) {
		this.datePanne = datePanne;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codeMachine, codePanne, datePanne, description, idPanne, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Panne other = (Panne) obj;
		return Objects.equals(codeMachine, other.codeMachine) && Objects.equals(codePanne, other.codePanne)
				&& Objects.equals(datePanne, other.datePanne) && Objects.equals(description, other.description)
				&& Objects.equals(idPanne, other.idPanne) && Objects.equals(status, other.status);
	}
	@Override
	public String toString() {
		return "Panne [idPanne=" + idPanne + ", codePanne=" + codePanne + ", codeMachine=" + codeMachine
				+ ", datePanne=" + datePanne + ", description=" + description + ", status=" + status + "]";
	}
	
	
}
