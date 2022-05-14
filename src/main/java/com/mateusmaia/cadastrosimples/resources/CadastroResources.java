package com.mateusmaia.cadastrosimples.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

import com.mateusmaia.cadastrosimples.domain.CadastroDomain;
import com.mateusmaia.cadastrosimples.services.CadastroService;

@RestController
@RequestMapping(value="/cadastros") 
public class CadastroResources {

	@Autowired
	private CadastroService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<CadastroDomain> find(@PathVariable Integer id) {
		CadastroDomain obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody CadastroDomain obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody CadastroDomain obj, @PathVariable Integer id) {
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
}
