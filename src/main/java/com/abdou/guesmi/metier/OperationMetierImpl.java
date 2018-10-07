package com.abdou.guesmi.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abdou.guesmi.dao.CompteRepository;
import com.abdou.guesmi.dao.EmployeRepository;
import com.abdou.guesmi.dao.OperationRepository;
import com.abdou.guesmi.entities.Compte;
import com.abdou.guesmi.entities.Employe;
import com.abdou.guesmi.entities.Operation;
import com.abdou.guesmi.entities.Retrait;
import com.abdou.guesmi.entities.Versement;

@Service
public class OperationMetierImpl implements OperationMetier {
	@Autowired
private OperationRepository operationrepository;
	@Autowired
	private CompteRepository compterepository;
	@Autowired
	private EmployeRepository employeRepository;
	
	
	@Override
	@Transactional
	public boolean verser(String code, double montant, Long codeEmpl) {
		Compte cp =compterepository.findOne(code);
		Employe e = employeRepository.findOne(codeEmpl);
		Operation o = new Versement();
		o.setDateoperation(new Date());
		o.setMontant(montant);
		o.setCompte(cp);
		o.setEmploye(e);
		operationrepository.save(o);
		cp.setSolde(cp.getSolde()+montant);
		return true;
	}

	@Override
	@Transactional
	public boolean retirer(String code, double montant, Long codeEmpl) {
		Compte cp =compterepository.findOne(code);
		if(cp.getSolde()<montant) throw new RuntimeException("solde insuffisant");
		Employe e = employeRepository.findOne(codeEmpl);
		Operation o = new Retrait();
		o.setDateoperation(new Date());
		o.setMontant(montant);
		o.setCompte(cp);
		o.setEmploye(e);
		operationrepository.save(o);
		cp.setSolde(cp.getSolde()-montant);
		return true;
	}

	@Override
	@Transactional
	public boolean virement(String cpt1,String cpt2, double montant, Long codeEmpl) {
		retirer(cpt1, montant, codeEmpl);
		verser(cpt2, montant, codeEmpl);
		
		return true;
	}

	@Override
	public PageOperations getOperations(String codeCompte, int page, int size) {
		
		Page<Operation> ops=operationrepository.getOperations
				(codeCompte, new PageRequest(page, size));
		PageOperations pOp=new PageOperations();
		pOp.setOperation(ops.getContent());
		pOp.setNbroperations(ops.getNumberOfElements());
		pOp.setPage(ops.getNumber());
		pOp.setTotalpages(ops.getTotalPages());
		pOp.setTotaloperations((int)ops.getTotalElements());
		
		return pOp;
	}

}
