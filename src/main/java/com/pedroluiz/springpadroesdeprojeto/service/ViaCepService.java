package com.pedroluiz.springpadroesdeprojeto.service;

import com.pedroluiz.springpadroesdeprojeto.model.Entity.Adress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url="http://viacep.com.br/ws")
public interface ViaCepService {
    @GetMapping("/{cep}/json/")
    Adress checkCep(@PathVariable("cep") String cep);
}
