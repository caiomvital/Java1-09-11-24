package gerador;

import java.util.Scanner;

public class Gerador {

	public static void gerarMensagem() {
		System.out.println("-_--_--_--_--");
		System.out.println("Olá, mundo!");
		System.out.println("-_--_--_--_--");

	}
	
	public static void gerarMensagemPersonalizada(String mensagem) {
		System.out.println("-_--_--_--_--");
		System.out.println(mensagem);
		System.out.println("-_--_--_--_--");

	}
	public static void gerarMensagem(String mensagem, String borda) {
		System.out.println(borda);
		System.out.println(mensagem);
		System.out.println(borda);
	}
	public static void gerarMensagem(int vezes, String mensagem, String borda) {
		for(int i = 0; i < vezes; i++) {
			gerarMensagem(mensagem, borda);
		}
	}
	public static void gerarMensagem(String mensagem) {
		Scanner scan = new Scanner(System.in);
		String borda;
		System.out.println("Escolha o tipo de borda: ");
		System.out.println("1. ~~ ~~ ~~");
		System.out.println("2. ´´ `` ´´");
		System.out.println("3. __--__--__");
		int opcao = scan.nextInt();
		
		switch(opcao) {
		case 1 -> borda = "~~ ~~ ~~";
		case 2 -> borda = "´´ `` ´´";
		case 3 -> borda = "__--__--__";
		default -> borda = "";
		}

		gerarMensagem(mensagem, borda);
	}
}
