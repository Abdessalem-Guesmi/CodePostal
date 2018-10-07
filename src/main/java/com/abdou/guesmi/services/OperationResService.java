package com.abdou.guesmi.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abdou.guesmi.metier.OperationMetier;
import com.abdou.guesmi.metier.PageOperations;
@RestController
public class OperationResService implements OperationMetier {
@Autowired
private OperationMetier operationMetier;
	@RequestMapping(value="/versement", method=RequestMethod.PUT)
	public boolean verser(
			@RequestParam String code, 
			@RequestParam double montant, 
			@RequestParam Long codeEmpl) {
		
		return operationMetier.verser(code, montant, codeEmpl);
	}

@RequestMapping(value="/retrait", method=RequestMethod.PUT)
public boolean retirer(
		@RequestParam String code, 
		@RequestParam double montant,
		@RequestParam Long codeEmpl) {
		
		return operationMetier.retirer(code, montant, codeEmpl);
	}

@RequestMapping(value="/virement", method=RequestMethod.PUT)
	public boolean virement(
			@RequestParam String cpt1, 
			@RequestParam String cpt2, 
			@RequestParam double montant, 
			@RequestParam Long codeEmpl) {
		// TODO Auto-generated method stub
		return operationMetier.virement(cpt1, cpt2, montant, codeEmpl);
	}

@RequestMapping(value="/operations", method=RequestMethod.GET)

public PageOperations getOperations(
		@RequestParam String codeCompte, 
		@RequestParam int page, 
		@RequestParam int size) {
	
	return operationMetier.getOperations(codeCompte, page, size);
}

}