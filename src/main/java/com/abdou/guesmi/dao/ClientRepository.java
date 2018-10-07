package com.abdou.guesmi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdou.guesmi.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
