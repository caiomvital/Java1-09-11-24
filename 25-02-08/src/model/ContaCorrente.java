package model;

import controller.Tarifavel;

public class ContaCorrente extends Conta implements Tarifavel {

	public ContaCorrente(String titular) {
		super(titular);
		
	}
	
	public void sacar(double valor) {
		if(valor > this.getSaldo() - 3.5) {
			System.out.println("Saldo insuficiente");
		} else {
			this.setSaldo(this.getSaldo() - valor); 
			this.cobrarTaxa(3.5);
		}
	}
	
	public void aplicar(ContaPoupanca destino, double valor) {
		destino.depositar(valor);
		this.sacar(valor);
	}

	@Override
	public void cobrarTaxa(double valor) {
		this.setSaldo(this.getSaldo() - valor);
		
	}
	
	

}
