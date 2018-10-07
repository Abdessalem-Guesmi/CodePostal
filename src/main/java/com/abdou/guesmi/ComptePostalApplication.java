package com.abdou.guesmi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.abdou.guesmi.dao.CompteRepository;
import com.abdou.guesmi.entities.Compte;
import com.abdou.guesmi.entities.CompteCourant;
import com.abdou.guesmi.entities.CompteEpargne;

@SpringBootApplication
@ImportResource("spring-beans.xml")
public class ComptePostalApplication {
	@Autowired
	private CompteRepository compteRepository;

	public static void main(String[] args) {
		SpringApplication.run(ComptePostalApplication.class, args);
		System.out.println("*****");
	}

	/*@Override
	public void run(String... args) throws Exception {
		Compte cp = new CompteCourant("CC10", new Date(), 900.00, 300.00);
		Compte cp2=new CompteEpargne("CE10", new Date() , 9000.00, 5.5);
		compteRepository.save(cp);
		compteRepository.save(cp2);
	
	}*/
}
