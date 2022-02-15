package br.com.desafio.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.desafio.banco.model.Transacao;
import br.com.desafio.banco.repository.TransacaoRepository;

@RestController
@RequestMapping("/transacao")
@CrossOrigin("*")
public class TransacaoController {

	@Autowired
	private TransacaoRepository repository;

	@GetMapping("/{id}")
	public ResponseEntity<Transacao> GetById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<Transacao> post(@RequestBody Transacao transacao) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(transacao));
	}

	@PutMapping
	public ResponseEntity<Transacao> put(@RequestBody Transacao transacao) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(transacao));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
