package br.com.banco;

public class ContaCorrente extends Conta {
	


	public ContaCorrente(Cliente cliente, int agencia, int numero) {
		super(cliente, agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extrato() {
		System.out.println("==============Conta Corrente=========");
		super.imprimirInfoComuns();
		
	}

	@Override
	protected void ultimasMovimentacoes() {
		if(super.ultimaTransferencia == true) {
			System.out.println("=========Ultima transferencia======= ");
		}else if(super.ultimoDeposito == true) {
			System.out.println("=========Ultima Deposito======= ");
		}
		
		super.ultimasMovimentacoes();
	}


}
