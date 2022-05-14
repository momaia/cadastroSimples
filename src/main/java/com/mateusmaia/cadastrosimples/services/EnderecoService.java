package com.mateusmaia.cadastrosimples.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateusmaia.cadastrosimples.domain.EnderecoDomain;
import com.mateusmaia.cadastrosimples.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repo;
	
	public EnderecoDomain find(Integer id) {
		Optional<EnderecoDomain> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
