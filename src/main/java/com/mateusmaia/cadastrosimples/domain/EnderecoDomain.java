package com.mateusmaia.cadastrosimples.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EnderecoDomain implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String logradouro;
	private String cidade;
    private String cep;

	@ManyToOne
	@JoinColumn(name="cadastro_id")
	private CadastroDomain cadastro;
	
    public EnderecoDomain() {
	}

	public EnderecoDomain(Integer id, CadastroDomain cadastro, String logradouro, String cidade, String cep) {
		super();
		this.id = id;
		this.cadastro = cadastro;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.cep = cep;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CadastroDomain getCadastro() {
		return cadastro;
	}

	public void setCadastro(CadastroDomain cadastro) {
		this.cadastro = cadastro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		EnderecoDomain other = (EnderecoDomain) obj;
		return Objects.equals(id, other.id);
	}
}
