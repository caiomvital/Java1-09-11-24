package model;

import java.util.Random;

public abstract class Conta {

	private String numero;
	private String titular;
	private double saldo;
	
	public Conta(String titular) {
		this.numero = gerarNumeroConta();
		this.titular = titular;
		this.saldo = 0;
	}
	
	
	public void exibirDados() {
		System.out.println("Número da Conta: " + numero);
		System.out.println("Titular: " + titular);
		System.out.println(String.format("Saldo Disponível: R$ %.2f", saldo));
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public String getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String gerarNumeroConta() {
		Random r = new Random();
		int random = r.nextInt(9999) + 1 ;
		return String.format("%04d", random);
	}
	

}
