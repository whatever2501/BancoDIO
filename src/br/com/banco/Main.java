package br.com.banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Cliente 1");
		int agencia1 = 1234;
		int numero1 = 1;
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Cliente 2");
		int agencia2 = 5678;
		int numero2 = 2;
		
		Conta cc = new ContaCorrente(cliente1,agencia1,numero1);
		cc.depositar(200);
	
		Conta cp = new ContaPoupanca(cliente2,agencia2,numero2);
		cc.transferir(150, cp);
		
		cc.extrato();		
		cp.extrato();
		
		
	
		
		

	}

}
