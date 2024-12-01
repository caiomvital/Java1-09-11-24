package exercicios;

import java.util.Scanner;

public class CalculadoraIMC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
int contador = 0;
		while(contador < 3) {
			System.out.println("Digite o nome: ");
			String nome = scan.nextLine();
			
			System.out.println("Digite a altura");
			double altura = scan.nextDouble();
			System.out.println("Digite o peso");
			double peso = scan.nextDouble(); scan.nextLine();
			double imc = peso / (altura * altura);
			String situacao = "";
			//Abaixo de 18.5: Abaixo do peso
			if (imc < 18.5) {
				situacao = "ABAIXO DO PESO".toLowerCase();
			}
			// → Entre 18.5 e 25: Peso ideal 
			else if (imc >= 18.5 && imc < 25) {
				situacao = "peso ideal".toLowerCase();
			}
			//Entre 25 e 30: Sobrepeso 
			else if (imc >= 25 && imc < 30) {
				situacao = "sobrepeso".toLowerCase();
			}
			//Entre 30 e 40: Obesidade 
			else if (imc >= 30 && imc < 40) {
				situacao = "OBESIDADE".toLowerCase();
			}
			//Acima de 40: Obesidade mórbida
			else {
				situacao = "obesidade mórbida".toLowerCase();
			}
			
			
			
			switch (situacao.toLowerCase()) {
			case "abaixo do peso" -> System.out.println(nome + " você está abaixo do peso. Consulte um nutricionista.");
			case "peso ideal" -> System.out.println(nome + "parabéns, você está no peso ideal.");
			case "sobrepeso" -> System.out.println(nome + "você está um pouco acima do peso ideal. Repense sua rotina de exercícios.");
			case "obesidade" -> System.out.println(nome + "você está obeso, procure um nutricionista e um cardiologista.");
			case "obesidade mórbida" ->	System.out.println(nome + "Você está com obesidade mórbida, procure um médico urgentemente.");

			}
		
		contador++;
		}
	}
}
