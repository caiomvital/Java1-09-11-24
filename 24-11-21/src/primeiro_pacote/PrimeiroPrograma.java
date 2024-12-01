package primeiro_pacote;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		String nomeCliente = "Tadeu Sylva"; 
		
		//tipos de dados numericos
		
		//tipo inteiro
		int valorInteiro = 8;
		int outroValorInteiro = 3;
		//tipo real
		double valorReal = 3.0;
		
		// + adicao
		int soma = valorInteiro + outroValorInteiro; // 8 + 3 = 11
		//System.out.println(soma);
		// - subtracao
		int sub = valorInteiro - outroValorInteiro; // 8 - 3 = 5
		//System.out.println(sub);
		// * multiplicacao
		int mult = valorInteiro * outroValorInteiro; // 8 * 3 = 24
		// / divisao
		//System.out.println(mult);
		// % resto da divisao
		double div = (double) valorInteiro / outroValorInteiro;
		//System.out.println(div);

		//tipo logico
		//variaveis booleanas
		//booleans
//		boolean cartaoVencido = false;
		boolean diaUtil = true;
//		// >, <, >=, <=, ==, !=
//		System.out.println("A" != "A");
		//operadores logicos
		// && || e !
		boolean estouDeFerias = false;
		boolean diaDescanso = !diaUtil || estouDeFerias; 
        System.out.println(diaDescanso);
		int idade = 18;
		boolean maiorDeIdade = idade >= 18;
		boolean cnhValido = false;
		boolean podeDirigir = maiorDeIdade == true && cnhValido == true;
		System.out.println(podeDirigir);
		
		//se
		boolean podeVotar;
		
		if(maiorDeIdade) {
			System.out.println("Pode votar.");
			if(cnhValido) {
				System.out.println("Pode dirigir.");
			} else {
				System.out.println("Não pode dirigir.");
			}
			
			
		}
		
		
		

	}

}
