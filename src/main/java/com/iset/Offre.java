package com.iset;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
public class Offre {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	long code;
	@Column(name = "intitule")
	String intitule;
	String specialite;
	String societe;

	int nbpostes;
	String pays;

public Offre() {
	
}
public Offre(String intitulé, String spécialité, String société, int nbpostes, String pays) {
    this.intitule = intitulé;
    this.nbpostes = nbpostes;
    this.pays = pays;
    this.societe = société;
	this.specialite = spécialité;
}
public long getCode() {
	return code;
}
public void setCode(long code) {
	this.code = code;
}
public String getIntitule() {
	return intitule;
}
public void setIntitule(String intitule) {
	this.intitule = intitule;
}
public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}
public String getSociete() {
	return societe;
}
public void setSociete(String societe) {
	this.societe = societe;
}
public int getNbpostes() {
	return nbpostes;
}
public void setNbpostes(int nbpostes) {
	this.nbpostes = nbpostes;
}
public String getPays() {
	return pays;
}
public void setPays(String pays) {
	this.pays = pays;
}

}
