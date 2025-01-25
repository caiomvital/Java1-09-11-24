package zoologico;

public class Animal extends SerVivo {

	private String especie;
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	public void emitirSom() {
		System.out.println("Som de animal");
	}
	
	@Override
	public String toString() {
		return super.toString()
		+ "\nEspécie: " + this.getEspecie();
	}
	
}
