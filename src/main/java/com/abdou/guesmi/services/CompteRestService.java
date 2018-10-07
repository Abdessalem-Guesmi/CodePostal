package com.abdou.guesmi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abdou.guesmi.entities.Compte;
import com.abdou.guesmi.metier.CompteMetier;
@RestController
public class CompteRestService {
	@Autowired
private CompteMetier codemetier;
@RequestMapping(value="/comptes", method=RequestMethod.POST)
	public Compte saveCompte(@RequestBody Compte cp) {
		return codemetier.saveCompte(cp);
	}
@RequestMapping(value="/comptes/{code}", method=RequestMethod.GET)

	public Compte getCompte(@PathVariable String code) {
		return codemetier.getCompte(code);
	}

}
