package com.abdou.guesmi.metier;

public interface OperationMetier {
public boolean verser(String code, double montant, Long codeEmpl);
public boolean retirer(String code, double montant, Long codeEmpl);
public boolean virement(String cpt1,String cpt2, double montant, Long codeEmpl);
public PageOperations getOperations(String codeCompte, int page, int size);


}
