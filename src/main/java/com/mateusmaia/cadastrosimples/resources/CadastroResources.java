package com.mateusmaia.cadastrosimples.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mateusmaia.cadastrosimples.domain.CadastroDomain;

@RestController
@RequestMapping(value="/cadastros") 
public class CadastroResources {

	@RequestMapping(method=RequestMethod.GET)
	public List<CadastroDomain> listar(){
		CadastroDomain Cliente = new CadastroDomain(1, "Mateus Maia", 88855511); 
		
		List<CadastroDomain> lista = new ArrayList<>();
		lista.add(Cliente);
		
		return lista;
	}
}
