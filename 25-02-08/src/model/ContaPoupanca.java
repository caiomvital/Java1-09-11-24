package model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String titular) {
		super(titular);
		
	}
	
	public void resgatar(ContaCorrente destino, double valor) {
		destino.depositar(valor);
		this.setSaldo(this.getSaldo() - valor);
	}

}
