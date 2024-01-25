package com.pedroluiz.springpadroesdeprojeto.model.repository;

import com.pedroluiz.springpadroesdeprojeto.model.Entity.Adress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends CrudRepository<Adress, String> {
}
