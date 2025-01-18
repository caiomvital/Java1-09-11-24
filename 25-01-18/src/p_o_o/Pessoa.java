package p_o_o;

public class Pessoa {

	private String nome;
	private String cpf;
	private int idade;
	
	
	//métodos construtores
	public Pessoa() {}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		
	} 
	//fim métodos construtores
	
	
	//métodos de acesso
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}
	
	//metodos de modificacao
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
