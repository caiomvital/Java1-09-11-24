package zoologico;

public class Zoologico {
public static void main(String[] args) {
	
	Ave arara = new Ave();
	arara.setNome("Arara");
	arara.setIdade(50);
	arara.setEspecie("Arara-azul");
	arara.setTipoBico("Curvo arredondado");
	
	System.out.println(arara);
	
	Mamifero gato = new Mamifero();
	gato.setNome("Felicia");
	gato.setIdade(3);
	gato.setEspecie("Felino");
	gato.setGenero("Femea");
	
	System.out.println(gato);
	
	gato.amamentar();
	
	Planta p = new Planta();
	p.setNome("Pé de jambo");
	p.setIdade(55);
	p.setTipo("Frutífera");
	
	System.out.println(p);
	

}
}
