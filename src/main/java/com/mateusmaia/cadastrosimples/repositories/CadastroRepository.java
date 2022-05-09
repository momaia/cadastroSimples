package com.mateusmaia.cadastrosimples.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mateusmaia.cadastrosimples.domain.CadastroDomain;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroDomain, Integer> {
	
}
