package com.mateusmaia.cadastrosimples;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mateusmaia.cadastrosimples.domain.CadastroDomain;
import com.mateusmaia.cadastrosimples.domain.EnderecoDomain;
import com.mateusmaia.cadastrosimples.repositories.CadastroRepository;
import com.mateusmaia.cadastrosimples.repositories.EnderecoRepository;

@SpringBootApplication
public class CadastrosimplesApplication implements CommandLineRunner {

	@Autowired
	private CadastroRepository cadastroRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CadastrosimplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CadastroDomain cad1 = new CadastroDomain(null, "Mateus Otavio", 888555);
		CadastroDomain cad2 = new CadastroDomain(null, "Maria da Silva", 777222);
		CadastroDomain cad3 = new CadastroDomain(null, "Marcos Oliveira", 455566);

		EnderecoDomain end1 = new EnderecoDomain(null, cad1, "Rua Joao Paulo, 1000", "São Paulo/SP","12055-552");
		EnderecoDomain end2 = new EnderecoDomain(null, cad1, "Rua Bento Lima, 125", "Campinas/SP","12021-340");
		EnderecoDomain end3 = new EnderecoDomain(null, cad2, "Av Tavares Lemes, 277", "Sorocaba/SP","14485-292");
		EnderecoDomain end4 = new EnderecoDomain(null, cad3, "Rua Lucia Lima, 755", "Rio de Janeiro/RJ","18552-315");

		cad1.setEndereco(Arrays.asList(end1, end2));
		cad2.setEndereco(Arrays.asList(end3));
		cad3.setEndereco(Arrays.asList(end4));

		cadastroRepository.saveAll(Arrays.asList(cad1, cad2, cad3));
		enderecoRepository.saveAll(Arrays.asList(end1, end2, end3, end4));
	}
}
