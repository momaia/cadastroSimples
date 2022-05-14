package com.mateusmaia.cadastrosimples.resources;

import com.mateusmaia.cadastrosimples.domain.EnderecoDomain;
import com.mateusmaia.cadastrosimples.services.EnderecoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/enderecos") 
public class EnderecoResources {

    @Autowired
	private EnderecoService service;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<EnderecoDomain> find(@PathVariable Integer id) {
		EnderecoDomain obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
