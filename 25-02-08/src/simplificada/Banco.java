package simplificada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

	static List<Conta> contas = new ArrayList<>();

	public static Conta localizarConta(String titular) {
		for (Conta c : contas) {
			if (c.getTitular().equalsIgnoreCase(titular)) {
				return c;

			}
		}
		return null;
	}

	public static void iniciar() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1. Criar conta");
			System.out.println("2. Sacar");
			System.out.println("3. Depositar");
			System.out.println("4. Transferir");
			System.out.println("5. Exibir Dados");
			System.out.println("6. Sair");

			int opcao = scan.nextInt();
			scan.nextLine();

			switch (opcao) {
			case 1 -> criarConta();
			case 2 -> iniciarSaque();
			case 3 -> iniciarDeposito();
			case 4 -> iniciarTransferencia();
			case 5 -> exibirDados();
			case 6 -> {break;}
			
			}
		}
	}

	public static void exibirDados() {
		for (Conta c : contas) {
			c.exibirDados();
			System.out.println("-------");
		}
	}

	public static void iniciarTransferencia() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o nome do titular da conta de origem: ");
		String nome = scan.nextLine();
		Conta origem = Banco.localizarConta(nome);
		System.out.println("Informe o nome do titular da conta de destino: ");
		nome = scan.nextLine();
		Conta destino = Banco.localizarConta(nome);

		if ((origem == null) || (destino == null)) {
			System.out.println("Conta inexistente");
		} else {
			System.out.println("Digite o valor: ");
			double valor = scan.nextDouble();
			try {
				origem.transferir(destino, valor);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void iniciarDeposito() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o nome do titular: ");
		String nome = scan.nextLine();
		Conta conta = Banco.localizarConta(nome);

		if (conta == null) {
			System.out.println("Conta inexistente");
		} else {
			System.out.println("Digite o valor: ");
			double valor = scan.nextDouble();
			try {
				conta.depositar(valor);
			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
		}
	}

	public static void iniciarSaque() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o nome do titular: ");
		String nome = scan.nextLine();
		Conta conta = Banco.localizarConta(nome);

		if (conta == null) {
			System.out.println("Conta inexistente");
		} else {
			System.out.println("Digite o valor: ");
			double valor = scan.nextDouble();
			try {
				conta.sacar(valor);
			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
		}
	}

	public static void criarConta() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do cliente: ");
		String nome = scan.nextLine();
		Conta conta = new Conta(nome);
		Banco.contas.add(conta);
	}

}
