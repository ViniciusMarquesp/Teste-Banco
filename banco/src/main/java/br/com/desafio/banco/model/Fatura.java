package br.com.desafio.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "fatura")
public class Fatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private double fatura;
	
	@NotNull
	private double saldoAnterior;
	
	@NotNull
	private double saldoDisponivel;
	
	@ManyToOne
	private Conta conta;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getFatura() {
		return fatura;
	}

	public void setFatura(double fatura) {
		this.fatura = fatura;
	}

	public double getSaldoAnterior() {
		return saldoAnterior;
	}

	public void setSaldoAnterior(double saldoAnterior) {
		this.saldoAnterior = saldoAnterior;
	}

	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
}
