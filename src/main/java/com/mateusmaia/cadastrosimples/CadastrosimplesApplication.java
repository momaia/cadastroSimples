package com.mateusmaia.cadastrosimples;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mateusmaia.cadastrosimples.domain.CadastroDomain;
import com.mateusmaia.cadastrosimples.repositories.CadastroRepository;

@SpringBootApplication
public class CadastrosimplesApplication implements CommandLineRunner {

	@Autowired
	private CadastroRepository cadastroRepository;

	public static void main(String[] args) {
		SpringApplication.run(CadastrosimplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CadastroDomain cad1 = new CadastroDomain(null, "Mateus Otavio", 888555);
		CadastroDomain cad2 = new CadastroDomain(null, "Maria da Silva", 777222);;

		cadastroRepository.saveAll(Arrays.asList(cad1, cad2));
	}
}
