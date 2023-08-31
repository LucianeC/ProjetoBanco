package br.com.java;

import java.io.Serializable;

public class Conta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numero ;
	private int agencia;
	private double saldo;
	
	
	public Conta() {	
	}
	
	
	public Conta(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	

	// Métodos sem retorno
	public void depositar(double valor) {
		this.saldo += valor; 
		
	}	
	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
	// Metodo para retornar o saldo 
	public double getSaldo() {
		return this.saldo; 
	}
	
	
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}





	Pessoa cliente = new Pessoa();
}
