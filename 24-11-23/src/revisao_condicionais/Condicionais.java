package revisao_condicionais;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do mês: ");
		String mes = scan.nextLine().toLowerCase();
		int diasMes = 0;
		
		switch(mes) {
		case "janeiro", "marco", "maio", "julho", 
		"agosto", "outubro", "dezembro" -> System.out.println("31 dias");
		case "abril", "junho", "setembro", "novembro" -> System.out.println("30 dias");
		case "feveiro" -> { diasMes = 28; System.out.println();}
		default -> System.out.println("Mês inválido");
			
		}
		
		
		if(mes.equals("janeiro") || mes.equals("marco") || mes.equals("maio")
				|| mes.equals("julho") || mes.equals("agosto") || mes.equals("outubro")
				|| mes.equals("dezembro")) {
			diasMes = 31;
		} else if(mes.equals("fevereiro")) {
			diasMes = 28;
		} else if(mes.equals("abril") || mes.equals("junho") || mes.equals("setembro") || mes.equals("novembro")) {
			diasMes = 30;
		} else {
			System.out.println("Mês inválido");
		}
		int opcao = 1;

		if(opcao == 1) {
			System.out.println("Salvar dados");
		} else if(opcao == 2) {
			System.out.println("Localizar dados");
		} else if(opcao == 3) {
			System.out.println("Atualizar dados");
		} else if(opcao == 4) {
			System.out.println("Remover dados");
		}
		
		
		
//		System.out.println("Informe a primeira nota: ");
//		double primeiraNota = scan.nextDouble();
//		System.out.println("Informe a segunda nota: ");
//		double segundaNota = scan.nextDouble();
//		
//		double media = (primeiraNota + segundaNota) / 2;
//		
//		String situacao = media > 7 ? "aprovado" : media > 4 ? "recuperacao" : "reprovado"; 
//		System.out.println(situacao);
//		if(media >= 7) {
//			System.out.printf("Aprovado! Sua média foi %.2f", media);
//			// se media == 10 -> aprovado com louvor
//			
//		} else if(media >= 4) {
//			System.out.printf("Em recuperação! Sua média foi %.2f".formatted(media));
//		} else {
//			System.out.println("Reprovado! Sua média foi %.2f".formatted(media));
//		}
		
		
		
		
		
//		String usuarioRegistrado = "TadeuSilva";
//		String senhaRegistrada = "12345";
//		
//		System.out.println("Digite o seu nome de usuário: ");
//		String usuario = scan.nextLine();
//		System.out.println("Digite a sua senha: ");
//		String senha = scan.nextLine();
//		
//		
//		if(usuario.equals(usuarioRegistrado) 
//				&& senha.equals(senhaRegistrada)) {
//			System.out.println("login efetuado com sucesso");
//		} else {
//			System.out.println("usuario ou senha incorretos");
//		}
			
		
		
		
		
		
		
		
//		int valor = 10;
//		boolean éPar = valor % 2 == 0;
//		boolean maiorQue10 = valor > 10;
//
//		if (maiorQue10) {
//			System.out.println("O valor é maior que 10");
//
//			if (éPar) {
//				System.out.println("É par");
//
//			} else {
//				System.out.println("É ímpar");
//			}
//		}

//		boolean tomarCafe = true; // pra tomar cafe
//		boolean temCafe = true; // verificar se tem cafe
//		boolean estouComSono = false; // ver se estou com sono
//		boolean acordeiCedo = false; // ver se acordei cedo
//		
//		if(temCafe) { // verifica se tem café
//			tomarCafe = true; // se tiver café, tomarCafe é true
//			System.out.println("Já que tem café, vou tomar");
//
//		} else { // se nao tiver cafe, vem para ca
//			System.out.println("Fazendo café");
//			temCafe = true;
//			tomarCafe = true;
//			System.out.println("Agora que tem café, vou tomar");
//		}
//		
//		if(estouComSono) {
//			tomarCafe = true;
//			System.out.println("Estou com sono, vou tomar café.");
//		}
//		
//		if(acordeiCedo) {
//			tomarCafe = true;
//			System.out.println("Acordei muito cedo, vou tomar café");
//		}
//
//		
//		System.out.println("Tomei café? " + tomarCafe);
//		
	}

}
