package com.mateusmaia.cadastrosimples.domain;

import java.io.Serializable;
import java.util.Objects;

public class CadastroDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private Integer cpf;
	
	
	
	public CadastroDomain(Integer id, String nome, Integer cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroDomain other = (CadastroDomain) obj;
		return Objects.equals(id, other.id);
	}
}
