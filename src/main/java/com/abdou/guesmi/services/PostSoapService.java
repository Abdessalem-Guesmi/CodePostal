package com.abdou.guesmi.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abdou.guesmi.entities.Compte;
import com.abdou.guesmi.metier.CompteMetier;
import com.abdou.guesmi.metier.OperationMetier;
import com.abdou.guesmi.metier.PageOperations;
/*
@WebService
@Component
public class PostSoapService {
	@Autowired
	private CompteMetier compteMetier;
	@Autowired
	private OperationMetier operationMetier;
	
	@WebMethod
	public Compte getCompte(@WebParam(name="code")String code) {
		return compteMetier.getCompte(code);
	}
	@WebMethod
	public boolean verser(@WebParam(name="code")String code, 
			@WebParam(name="montant")double montant, 
			@WebParam(name="codeEmpl")Long codeEmpl) {
		return operationMetier.verser(code, montant, codeEmpl);
	}
	@WebMethod
	public boolean retirer(@WebParam(name="code")String code, 
			@WebParam(name="montant")double montant, 
			@WebParam(name="codeEmpl")Long codeEmpl) {
		return operationMetier.retirer(code, montant, codeEmpl);
	}
	@WebMethod
	public boolean virement(@WebParam(name="cpt1")String cpt1, 
			@WebParam(name="cpt2")String cpt2,
			@WebParam(name="montant")double montant, 
			@WebParam(name="codeEmpl")Long codeEmpl) {
		return operationMetier.virement(cpt1, cpt2, montant, codeEmpl);
	}
	@WebMethod
	public PageOperations getOperations(@WebParam(name="codeCompte")String codeCompte,
			@WebParam(name="page")int page, 
			@WebParam(name="size")int size) {
		return operationMetier.getOperations(codeCompte, page, size);
	}
	

}*/
