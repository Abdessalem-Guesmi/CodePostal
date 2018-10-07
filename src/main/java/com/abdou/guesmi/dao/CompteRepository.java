package com.abdou.guesmi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdou.guesmi.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String>{

}
