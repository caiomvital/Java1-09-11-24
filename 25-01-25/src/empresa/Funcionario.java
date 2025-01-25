package empresa;

public class Funcionario extends Pessoa {

	String matricula;
	double salario;
	String funcao;
	
	public Funcionario(String nome, String funcao) {
		super(nome);
		this.funcao = funcao;		
	}
	
	
}
