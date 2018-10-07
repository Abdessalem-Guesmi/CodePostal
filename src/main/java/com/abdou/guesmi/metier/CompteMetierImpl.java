package com.abdou.guesmi.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdou.guesmi.dao.CompteRepository;
import com.abdou.guesmi.entities.Compte;
@Service
public class CompteMetierImpl implements CompteMetier {
	@Autowired
private CompteRepository compterepository;

	@Override
	public Compte saveCompte(Compte cp) {
		cp.setDateCreation(new Date());
		return compterepository.save(cp);
	}

	@Override
	public Compte getCompte(String code) {
		// TODO Auto-generated method stub
		 
		Compte cp= compterepository.findOne(code);
		if(cp==null) throw new RuntimeException("Compte inexistant!");
				return cp;
	}

}

