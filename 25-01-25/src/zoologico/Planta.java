package zoologico;

public class Planta extends SerVivo {

	private String tipo;
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void realizarFotossintese() {
		System.out.println(this.getNome() + " realizou a fotossíntese");
		
	}
	
}
