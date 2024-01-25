package com.pedroluiz.springpadroesdeprojeto.service;

import com.pedroluiz.springpadroesdeprojeto.model.Entity.Client;

public interface ClientService {
    Iterable<Client> findAll();

    Client findById(Long id);

    void create(Client client);

    void update(Long id, Client client);

    void delete(Long id);
}
