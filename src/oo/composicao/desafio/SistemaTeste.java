package oo.composicao.desafio;

public class SistemaTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1.99, 100);
		compra1.adicionarItem(new Produto("Notebook", 1999.99), 3);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 18.99, 20);
		compra2.adicionarItem(new Produto("Impressora", 799.99), 3);	
		
		Cliente cliente = new Cliente("Anderson Silva");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obterValorTotalPorCliente());
	}
}
