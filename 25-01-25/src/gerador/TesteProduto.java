package gerador;

public class TesteProduto {
public static void main(String[] args) {
	Produto p = new Produto();
	p.preco = 9.99;
	p.qtd = 12;
	p.calcularValorTotal();
}
}
