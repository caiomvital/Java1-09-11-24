package empresa;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, String funcao) {
		super(nome, funcao);
		
	}

	public void realizarVenda() {
		System.out.println("Venda realizada.");
	}
}
