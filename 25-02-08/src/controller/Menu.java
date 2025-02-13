package controller;

import java.util.Scanner;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import view.Banco;

public class Menu {
	
	static String menuPrincipal = """
			1. Exibir Dados
			2. Sacar
			3. Depositar
			4. Resgatar
			5. Aplicar
			6. Sair
			
			""";
	
	static String menuCriarConta = """
			Bem-vindo ao Banco
			1. Criar Conta
			2. Acessar Conta
			3. Sair
			""";
	
	public static void exibirMenuPrincipal() {
		System.out.println(menuPrincipal);
	}
	public static void exibirMenuConta() {
		System.out.println(menuCriarConta);

	}
	
	public static void criarConta() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do titular: ");
		String nome = scan.nextLine();
		ContaCorrente cc = new ContaCorrente(nome);
		ContaPoupanca cp = new ContaPoupanca(nome);
		Banco.contasCorrente.add(cc);
		Banco.contasPoupanca.add(cp);
	}
	
	public void acessarConta(String numero) {
		for(Conta c : Banco.contasCorrente) {
			if(c.getNumero().equals(numero)) {
				c.exibirDados();
			}
		}
		
		System.out.println();
		
		for(Conta c : Banco.contasPoupanca) {
			if(c.getNumero().equals(numero)) {
				c.exibirDados();
			}
		}
		
		exibirMenuPrincipal();
		iniciarOperacoes(numero);
	}
	
	public static void iniciarOperacoes(String numero) {
		Scanner scan = new Scanner(System.in);
		int opcao = scan.nextInt(); scan.nextLine();
		System.out.println("Informe o número da conta: ");
		String num = scan.nextLine();
		
		ContaCorrente cc = new ContaCorrente("");
		ContaPoupanca cp = new ContaPoupanca("");
		
		exibirMenuPrincipal();

		switch(opcao) {
		
		case 1 -> { // saque
			
			for(ContaCorrente c : Banco.contasCorrente) {
				if(c.getNumero().equals(num)) {
					cc = c;
					System.out.println("Informe o valor do saque: ");
					double valor = scan.nextDouble();
					c.sacar(valor);
					
				}
			}
		}
		
		case 2 -> { // deposito
			for(ContaCorrente c : Banco.contasCorrente) {
				if(c.getNumero().equals(num)) {
					cc = c;
					System.out.println("Informe o valor do depósito: ");
					double valor = scan.nextDouble();
					c.depositar(valor);
					
				}
			}
		}
		
		case 3 -> {
			for(ContaPoupanca c : Banco.contasPoupanca) {
				if(c.getNumero().equals(num)) {
					cp = c;
					for(ContaCorrente corrente : Banco.contasCorrente) {
						if(c.getNumero().equals(num)) {
							cc = corrente;
						}
							
						}
					
					
					System.out.println("Informe o valor do resgate: ");
					double valor = scan.nextDouble();
					c.resgatar(cc, valor);
					
					
				}
			}
		}
		case 4 -> {
			for(ContaCorrente c : Banco.contasCorrente) {
				if(c.getNumero().equals(num)) {
					
					for(ContaPoupanca poupanca : Banco.contasPoupanca) {
						if(c.getNumero().equals(num)) {
							cp = poupanca;
						}
							
						}
					
					System.out.println("Informe o valor da aplicação: ");
					double valor = scan.nextDouble();
					c.aplicar(cp, valor);
					
					
				}
			}
		}
		case 5 -> {
			System.out.println("Obrigado");
			break;
		}
		
		}
		
		

	}
}
