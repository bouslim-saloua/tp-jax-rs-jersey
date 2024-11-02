package com.example.jax_rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.example.jax_rs.entities.Compte;
import com.example.jax_rs.entities.TypeCompte;
import com.example.jax_rs.repository.CompteRepository;

@SpringBootApplication
public class JaxRsJerseyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxRsJerseyApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(CompteRepository compteRepository){
		return args->{
			compteRepository.save(new Compte(null, Math.random()*9000, new Date(),TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, Math.random()*9000,new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, Math.random()*9000, new Date(),TypeCompte.EPARGNE));
			compteRepository.findAll().forEach(System.out::println);
		};
}
}
