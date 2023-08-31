package br.com.java;
import java.io.Serializable;


//Marcar a classe como serializado 
public class Pessoa implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Os atributos encapsulado para que nenhuma classe externa altere. 
	private String nome;
	private byte idade; 
	
	
	//Metodos para alterar os atributos protegidos
	// GET - opter a informação 
	// SET alterar a informação
	
	public String getNome() {
		return nome; 
		
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	
	
	
}
