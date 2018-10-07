package com.abdou.guesmi.metier;

import com.abdou.guesmi.entities.Compte;

public interface CompteMetier {
	public Compte saveCompte(Compte cp);
	public Compte getCompte(String code);
	

}
