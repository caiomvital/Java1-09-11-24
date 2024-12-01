package lacos;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// peca ao usuario que insira um numero
		// continue pedindo ate que ele digite 0
		// depois, mostre a soma dos numeros digitados

		int soma = 0;
		
		System.out.println("Digite um valor: ");
		int numero = scan.nextInt();
		
		while(true) {
			soma += numero;
			System.out.println("Digite um valor: ");
			numero = scan.nextInt();
			
			if(numero == 0) {
				break;
			}
			
		}
		
		System.out.println("A soma dos valores é: " + soma);
		
		
		
		// faca um codigo que imprima de 1 ate 20
		// depois imprima de 20 ate 1

		int valor = 1;

		while (valor <= 20) {
			System.out.print(valor++ + " ");
		}
		System.out.println();
		while (valor > 1) {
			System.out.print(--valor + " ");
		}

//		int valor = 1;
//		
//		while(valor <= 10) {
//			System.out.println("Valor: " + valor++);
//			
//		}

	}
}
