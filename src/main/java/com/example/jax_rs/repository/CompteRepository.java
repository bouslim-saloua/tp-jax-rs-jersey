package com.example.jax_rs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jax_rs.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
