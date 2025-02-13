package teste;

import java.util.Random;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Random r = new Random();
		int random = r.nextInt(9999) + 1 ;
		System.out.println(random);
		String num = String.format("%04d", random);
		
		System.out.println(num);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		while(!scan.hasNextInt()) {
			System.out.println("Por favor digite um valor inteiro: ");
			scan.next();
		}
		
		int valor = scan.nextInt();
		System.out.println(valor);
		

		

	}

}
