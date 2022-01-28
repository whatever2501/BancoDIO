package br.com.banco;

public interface iConta {
	
	void sacar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void depositar(double valor);
	
	
	void extrato();

}
