package com.pedroluiz.springpadroesdeprojeto.controller;

import com.pedroluiz.springpadroesdeprojeto.model.Entity.Client;
import com.pedroluiz.springpadroesdeprojeto.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customers")
public class ClientRestController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Iterable<Client>> findAll(){
        return ResponseEntity.ok(clientService.findAll());
    }

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody Client client){
        clientService.create(client);
        return ResponseEntity.ok(client);
    }

    @PutMapping("/update={id}")
    public ResponseEntity<Client> update(@PathVariable Long id, @RequestBody Client client){
        clientService.update(id, client);
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("delete={id}")
    public ResponseEntity<Client> delete(@PathVariable Long id){
        clientService.delete(id);
        return ResponseEntity.ok().build();
    }
}
