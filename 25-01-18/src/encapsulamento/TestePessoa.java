package encapsulamento;

import p_o_o.Funcionario;
import p_o_o.Pessoa;

public class TestePessoa {
public static void main(String[] args) {
	
	Pessoa t = new Pessoa("Tadeu");
	System.out.println(t.getNome());
	t.setNome("Tadeu Silva");
	t.setIdade(35);
	Pessoa f = new Pessoa("Francisca Leopoldina", "12345");
	System.out.println(f.getNome());
	f.setNome(f.getNome() + " Silva");
	System.out.println(f.getNome());
	
	Pessoa g = new Pessoa("Gervásio", 30);

	Pessoa c = new Pessoa("Creso", "12345", 29);
	
	Funcionario func = new Funcionario();
	
	
	
}
}
