package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Tadeu");
		nomes.add("Gervásio");
		nomes.add("Creso");
		nomes.add("Jessica");
		
		String[] nomesArray = new String[3];
		nomesArray[0] = "Tadeu";
		nomesArray[1] = "Gervásio";
		nomesArray[2] = "Creso";
		//nomesArray[4] = "Jessica";
		
		
		System.out.println("Insira um valor: ");
		int valor = scan.nextInt();
		//esta variavel armazena o valor inserido pelo usuario
		
		while(valor != 0) { // aqui o laco verifica se o valor inserido pelo usuario não é 0
			if(valor % 2 == 0) { // esta linha verifica se o valor inserido pelo usuario é par
				System.out.println("Valor é par."); // esta linha imprime se o valor é par
			} else { // se nao for par
				System.out.println("Valor é ímpar."); // esta linha imprime que o valor é impar
			}
			System.out.println("Insira um valor "
					+ "ou digite 0 para encerrar: "); //esta linha informa ao usuario para digitar um novo valor ou 0 para sair
			valor = scan.nextInt(); // esta linha le novamente o valor
		}
		
		System.out.println("Fora do laço");
		
	}
}
