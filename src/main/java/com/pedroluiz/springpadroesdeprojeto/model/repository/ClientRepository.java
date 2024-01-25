package com.pedroluiz.springpadroesdeprojeto.model.repository;

import com.pedroluiz.springpadroesdeprojeto.model.Entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
}
