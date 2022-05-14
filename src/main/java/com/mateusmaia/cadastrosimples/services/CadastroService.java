package com.mateusmaia.cadastrosimples.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.mateusmaia.cadastrosimples.domain.CadastroDomain;
import com.mateusmaia.cadastrosimples.repositories.CadastroRepository;
import com.mateusmaia.cadastrosimples.services.exceptions.DataIntegrityException;

@Service
public class CadastroService {

	@Autowired
	private CadastroRepository repo;

	public CadastroDomain find(Integer id) {
		Optional<CadastroDomain> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public CadastroDomain insert(CadastroDomain obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public CadastroDomain update(CadastroDomain obj){
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um cadastro que possui endereço");
		}
	}
}
