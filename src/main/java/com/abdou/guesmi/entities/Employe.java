package com.abdou.guesmi.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
@Entity
public class Employe implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeEmpl;
	private String nom;
	@ManyToOne	
	@JoinColumn(name="code_empl_sup")
	private Employe employSup;
	
	@ManyToMany 
	@JoinTable(name="EMP_GR")
	
	private Collection<Groupe> groupes;
	
	public Long getCodeEmpl() {
		return codeEmpl;
	}
	public void setCodeEmpl(Long codeEmpl) {
		this.codeEmpl = codeEmpl;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@JsonIgnore
	public Employe getEmploySup() {
		return employSup;
	}
	@JsonSetter
	public void setEmploySup(Employe employSup) {
		this.employSup = employSup;
	}
	@JsonIgnore
	public Collection<Groupe> getGroupes() {
		return groupes;
	}
	@JsonSetter
	public void setGroupes(Collection<Groupe> groupes) {
		this.groupes = groupes;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String nom) {
		super();
		this.nom = nom;
	}
	

}
