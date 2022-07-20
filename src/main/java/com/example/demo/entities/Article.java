package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long idArticle;
  private String  codeArticle;
  private String designation;
  private Double prixUnitaire;
  private Double  quantite;
  private Double  quantiteMin;
  private String emplacement;
  private String unite;
  private String famille;
public Article() {
	super();
	// TODO Auto-generated constructor stub
}
public Article(Long idArticle, String codeArticle, String designation, Double prixUnitaire, Double quantite,
		Double quantiteMin, String emplacement, String unite, String famille) {
	super();
	this.idArticle = idArticle;
	this.codeArticle = codeArticle;
	this.designation = designation;
	this.prixUnitaire = prixUnitaire;
	this.quantite = quantite;
	this.quantiteMin = quantiteMin;
	this.emplacement = emplacement;
	this.unite = unite;
	this.famille = famille;
}
public Long getIdArticle() {
	return idArticle;
}
public void setIdArticle(Long idArticle) {
	this.idArticle = idArticle;
}
public String getCodeArticle() {
	return codeArticle;
}
public void setCodeArticle(String codeArticle) {
	this.codeArticle = codeArticle;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Double getPrixUnitaire() {
	return prixUnitaire;
}
public void setPrixUnitaire(Double prixUnitaire) {
	this.prixUnitaire = prixUnitaire;
}
public Double getQuantite() {
	return quantite;
}
public void setQuantite(Double quantite) {
	this.quantite = quantite;
}
public Double getQuantiteMin() {
	return quantiteMin;
}
public void setQuantiteMin(Double quantiteMin) {
	this.quantiteMin = quantiteMin;
}
public String getEmplacement() {
	return emplacement;
}
public void setEmplacement(String emplacement) {
	this.emplacement = emplacement;
}
public String getUnite() {
	return unite;
}
public void setUnite(String unite) {
	this.unite = unite;
}
public String getFamille() {
	return famille;
}
public void setFamille(String famille) {
	this.famille = famille;
}
@Override
public String toString() {
	return "Article [idArticle=" + idArticle + ", codeArticle=" + codeArticle + ", designation=" + designation
			+ ", prixUnitaire=" + prixUnitaire + ", quantite=" + quantite + ", quantiteMin=" + quantiteMin
			+ ", emplacement=" + emplacement + ", unite=" + unite + ", famille=" + famille + "]";
}
@Override
public int hashCode() {
	return Objects.hash(codeArticle, designation, emplacement, famille, idArticle, prixUnitaire, quantite, quantiteMin,
			unite);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Article other = (Article) obj;
	return Objects.equals(codeArticle, other.codeArticle) && Objects.equals(designation, other.designation)
			&& Objects.equals(emplacement, other.emplacement) && Objects.equals(famille, other.famille)
			&& Objects.equals(idArticle, other.idArticle) && Objects.equals(prixUnitaire, other.prixUnitaire)
			&& Objects.equals(quantite, other.quantite) && Objects.equals(quantiteMin, other.quantiteMin)
			&& Objects.equals(unite, other.unite);
}
  
}
