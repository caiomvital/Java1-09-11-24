package empresa;

public class Pessoa {

	String nome;
	String cpf;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void apresentacao() {
		System.out.println("Olá, me chamo " + nome);
	}
	
}
