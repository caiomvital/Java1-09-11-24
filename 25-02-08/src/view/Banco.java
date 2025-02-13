package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.Menu;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Banco {
	
	public static List<ContaCorrente> contasCorrente = new ArrayList<>();
	public static List<ContaPoupanca> contasPoupanca = new ArrayList<>();
	
public static void main(String[] args) {
/*	
 	ContaCorrente cc = new ContaCorrente("Tadeu");
	contas.add(cc);
	ContaCorrente corrente = (ContaCorrente) contas.get(0);
	corrente.sacar(10);
	cc.exibirDados();  
*/
	Scanner scan = new Scanner(System.in);

	Menu.criarConta();
	Banco.contasCorrente.get(0).exibirDados();	
	Menu.iniciarOperacoes(Banco.contasCorrente.get(0).getNumero());
	Banco.contasCorrente.get(0).exibirDados();	
}
}
