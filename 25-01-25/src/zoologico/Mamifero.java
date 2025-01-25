package zoologico;

public class Mamifero extends Animal {

	private String genero;
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void amamentar() {
		System.out.println(this.getNome() + " está amamentando os filhotes");
	}
	
	@Override
	public String toString() {
	 return super.toString() +
			 "\nGênero: " + this.getGenero();
	}
}
