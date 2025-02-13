package simplificada;

public class Conta {

	private String titular;
	private double saldo;
	
	public Conta(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) throws Exception {
		if(valor > this.saldo) {
			throw new Exception("Saldo insuficiente"); 
		} else {
			this.saldo -= valor;
			System.out.println("Saque efetuado.");
			System.out.println(String.format("Novo saldo: R$ %.2f", this.getSaldo()));
		}
	}
	
	public void depositar(double valor) throws Exception {
		if(valor <= 0) {
			throw new Exception("Valor inválido"); 
		} else {
			this.saldo += valor;
			System.out.println("Deposito efetuado.");
			System.out.println(String.format("Novo saldo: R$ %.2f", this.getSaldo()));
		}
	}
	
	public void exibirDados() {
		System.out.println("Titular: " + titular);
		System.out.println(String.format("Saldo Disponível: R$ %.2f", saldo));
	}
	
	public void transferir(Conta destino, double valor) throws Exception {
		if(destino.titular == null) {
			throw new Exception("Conta de destino inexistente");
		} else {
			this.saldo = this.saldo -= valor;
			destino.setSaldo(destino.getSaldo() + valor);
		}
		
		
	}

}
