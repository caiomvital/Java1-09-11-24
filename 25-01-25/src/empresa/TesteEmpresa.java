package empresa;

import java.util.ArrayList;
import java.util.List;

public class TesteEmpresa {
public static void main(String[] args) {
	List<Vendedor> vendedores = new ArrayList<>();
	
	Vendedor v = new Vendedor("Gervásio", "Vendedor");
	Gerente g = new Gerente("Tadeu", "Gerente de Vendas");
	Cliente c = new Cliente("Amaral");

	v.realizarVenda();
	
}
}
