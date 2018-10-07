package com.abdou.guesmi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abdou.guesmi.entities.Employe;
import com.abdou.guesmi.metier.EmployeMetierImpl;

@RestController
public class EmployeRestService {
	@Autowired
private EmployeMetierImpl employeMetierImpl;
@RequestMapping(value="/employes", method=RequestMethod.POST)
	public Employe saveEmloye(@RequestBody Employe e) {
		return employeMetierImpl.saveEmloye(e);
	}
@RequestMapping(value="/employes")
	public List<Employe> listEmployes() {
		return employeMetierImpl.listEmployes();
	}

}
