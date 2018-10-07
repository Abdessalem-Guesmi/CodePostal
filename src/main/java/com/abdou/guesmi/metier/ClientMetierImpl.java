package com.abdou.guesmi.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdou.guesmi.dao.ClientRepository;
import com.abdou.guesmi.entities.Client;
@Service
public class ClientMetierImpl implements ClientMetier {
	@Autowired
private ClientRepository clientrepository;

	@Override
	public Client saveClient(Client c) {
		
		return clientrepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		
		return clientrepository.findAll();
	}

}
