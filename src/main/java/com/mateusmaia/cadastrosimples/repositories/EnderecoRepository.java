package com.mateusmaia.cadastrosimples.repositories;

import com.mateusmaia.cadastrosimples.domain.EnderecoDomain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoDomain, Integer> {

}
