package com.abdou.guesmi.metier;

import java.util.List;

import com.abdou.guesmi.entities.Client;

public interface ClientMetier {
public Client saveClient(Client c);
public List<Client> listClient();

}
