package p_o_o;

import java.util.Scanner;

public class Aluno {

	String nome;
	double nota1;
	double nota2;
	double media;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno() {}
	
	void calcularMedia() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		nota1 = scan.nextDouble();
		System.out.println("Nota 2: ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		System.out.println("Média do aluno: " + media);
		
	}

	@Override
	public String toString() {
		return "Nome do Aluno: " + this.nome + "\n"
				+ "Nota 1: " + this.nota1 + "\n"
				+ "Nota 2: " + this.nota2 + "\n"
				+ "Média: " + this.media + "\n";
	}
	
	
	
}
