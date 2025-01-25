package zoologico;

public class Ave extends Animal {

	private String tipoBico;
	
	public String getTipoBico() {
		return tipoBico;
	}
	
	public void setTipoBico(String tipoBico) {
		this.tipoBico = tipoBico;
	}
	
	public void voar() {
		System.out.println(this.getNome() + " está voando");
	}
	
	@Override
	public String toString() {
	 return super.toString() +
			 "\nTipo de Bico: " + this.getTipoBico();
	}
	
}
