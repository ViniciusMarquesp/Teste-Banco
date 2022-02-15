package br.com.desafio.banco.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.banco.model.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
