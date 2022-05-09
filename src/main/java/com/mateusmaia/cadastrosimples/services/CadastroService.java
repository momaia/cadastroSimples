package com.mateusmaia.cadastrosimples.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateusmaia.cadastrosimples.domain.CadastroDomain;
import com.mateusmaia.cadastrosimples.repositories.CadastroRepository;

@Service
public class CadastroService {

	@Autowired
	private CadastroRepository repo;

	public CadastroDomain find(Integer id) {
		Optional<CadastroDomain> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
