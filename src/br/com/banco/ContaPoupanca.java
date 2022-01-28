package br.com.banco;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente, int agencia, int numero) {
		super(cliente, agencia, numero);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void extrato() {
		System.out.println("==============Conta Poupança=========");
		super.imprimirInfoComuns();
		
	}


	@Override
	public void ultimasMovimentacoes() {
		if(super.ultimaTransferencia == true) {
			System.out.println("=========Ultima transferencia======= ");
		}else if(super.ultimoDeposito == true) {
			System.out.println("=========Ultima Deposito======= ");
		}
		super.ultimasMovimentacoes();
		
	}



}
