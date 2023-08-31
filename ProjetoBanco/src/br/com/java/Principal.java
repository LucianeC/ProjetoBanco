package br.com.java;

public class Principal {
	public static void main(String[] args) {
		
		// A variavel cc "controla" a Conta(Objeto que está em memoria)
		Conta cc = new Conta();
		cc.depositar(20.0); 
		cc.setAgencia(123);
		cc.setNumero (321);
		
		
		cc.depositar(1000);
		System.out.println(cc.getSaldo());
		
		Conta poupanca = new Conta(221 , 1000, 60); 
		poupanca.retirar(10);
		System.out.println(poupanca.getSaldo());
		
		
		
		
		
//		Conta contaCorrente = new Conta(); 
//		Conta contaPoupanca = new Conta();
//		Conta contaInvestimento = new Conta();
//		
//		contaCorrente.numero = 11;
//		contaCorrente.saldo = 50.5;
//		contaCorrente.cliente.nome = "Marcos";
//		contaCorrente.cliente.idade = 23;
//
//		
//		contaPoupanca.numero = 23;
//		contaPoupanca.saldo = 30.5; 
//		contaPoupanca.cliente.nome = "Julia";
//		contaPoupanca.cliente.idade = 23;
//		
//		
//		contaInvestimento.numero = 22;
//		contaInvestimento.saldo = 4500.0;
//		contaInvestimento.cliente.nome =" Rafa";
//		contaInvestimento.cliente.idade = 19;
//	
//		
//		System.out.println( contaInvestimento.cliente.nome 
//				+ contaInvestimento.cliente.idade + contaInvestimento.saldo);
	}

}
