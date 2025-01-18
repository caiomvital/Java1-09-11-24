package p_o_o;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteAluno {
public static void main(String[] args) {
	
//	Aluno tadeu = new Aluno("Tadeu");
//	Aluno gervasio = new Aluno();
//	gervasio.nome = "Gervásio";
	
//	tadeu.calcularMedia();
//	
//	System.out.println(tadeu.media);

	
	
	List<Aluno> alunos = new ArrayList<>();
	
	for(int i = 0; i < 3; i++) {
		
		System.out.println("Diga o nome do novo aluno: "); // pede o nome do aluno
		Scanner scan = new Scanner(System.in); 
		String nome = scan.nextLine(); // lê o nome do aluno
		Aluno aluno = new Aluno(nome); // cria um objeto aluno com o nome passado
		alunos.add(aluno); // adiciona o aluno à lista
		aluno.calcularMedia();

	}
	
	System.out.println(alunos);
	
//	for(Aluno aluno : alunos) {
//		System.out.println(aluno.nome + " | " + aluno.media);
//		
//	}
	
	
	//um curso tem varias turmas
	//uma turma tem varios alunos
	
	//curso exibiria um toString que mostraria todas as turmas 
	//e todas as turmas mostrando os alunos
	
	
	
}
}
