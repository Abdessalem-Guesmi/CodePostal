package com.abdou.guesmi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length=1)
@JsonTypeInfo(
		use=JsonTypeInfo.Id.NAME, 
		include=JsonTypeInfo.As.PROPERTY,
		property="type")
@JsonSubTypes({
	@Type(name="V", value=Versement.class),
	@Type(name="R", value=Retrait.class)
})
public class Operation implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long numoperation;
private Date dateoperation;
private double montant;
@ManyToOne
@JoinColumn(name="CODE_Compte")
private Compte compte;
@ManyToOne
@JoinColumn(name="CODE_Empl")
private Employe employe;
public Operation() {
	super();
	// TODO Auto-generated constructor stub
}
public Operation(Date dateoperation, Long montant) {
	super();
	this.dateoperation = dateoperation;
	this.montant = montant;
}
public Long getNumoperation() {
	return numoperation;
}
public void setNumoperation(Long numoperation) {
	this.numoperation = numoperation;
}
public Date getDateoperation() {
	return dateoperation;
}
public void setDateoperation(Date dateoperation) {
	this.dateoperation = dateoperation;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
@JsonIgnore
@XmlTransient
public Compte getCompte() {
	return compte;
}
public void setCompte(Compte compte) {
	this.compte = compte;
}
@JsonIgnore
@XmlTransient
public Employe getEmploye() {
	return employe;
}
@JsonSetter
public void setEmploye(Employe employe) {
	this.employe = employe;
}

}
