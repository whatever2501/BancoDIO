package br.com.banco;

public abstract class Conta implements iConta {
	

	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	protected double valorTransferido;
	protected String clienteDestino;
	protected int agenciaDestino;
	
	protected double valorDeposito;
	
	protected boolean ultimaTransferencia = false;
	protected boolean ultimoDeposito = false;
	
	
	
	
	public Conta(Cliente cliente, int agencia, int numero) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.numero = numero;
	}
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}@Override
	public void depositar(double valor) {
		this.saldo += valor; 
		
		this.valorDeposito = valor;
		
		ultimoDeposito = true;
		ultimaTransferencia = false;
		
	}@Override
	public void transferir(double valor, Conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
		valorTransferido = valor;
		clienteDestino = contaDestino.cliente.getNome();
		agenciaDestino = contaDestino.agencia;
		
		ultimoDeposito = false;
		ultimaTransferencia = true;
		
	}
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Nome: %s", cliente.getNome()));
		System.out.println(String.format("Agencia : %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo : %.2f", this.saldo));
		this.ultimasMovimentacoes();
	}
	
	protected void ultimasMovimentacoes() {
		
		System.out.println(String.format("Cliente: %s",this.cliente.getNome() ));
		
		if(ultimaTransferencia == true) {
			System.out.println(String.format("Ultima transferencia para: %s",clienteDestino ));
		}else if(ultimoDeposito == true) {
			System.out.println(String.format("Ultimo deposito para: %.2f",this.valorDeposito ));
		}
		
		
	}
}
