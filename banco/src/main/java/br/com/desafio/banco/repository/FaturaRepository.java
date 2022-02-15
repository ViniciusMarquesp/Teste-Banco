package br.com.desafio.banco.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.banco.model.Fatura;

@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Long> {
	public List<Fatura> findAllByFatura (double fatura);

}
