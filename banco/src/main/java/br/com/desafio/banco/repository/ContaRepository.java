package br.com.desafio.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.banco.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
	
}
