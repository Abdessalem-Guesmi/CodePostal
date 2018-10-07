package com.abdou.guesmi.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdou.guesmi.dao.EmployeRepository;
import com.abdou.guesmi.entities.Employe;
@Service
public class EmployeMetierImpl implements EmployeMetier {
@Autowired
private EmployeRepository employeRepository;

	@Override
	public Employe saveEmloye(Employe e) {
		// TODO Auto-generated method stub
		return employeRepository.save(e);
	}

	@Override
	public List<Employe> listEmployes() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

}
