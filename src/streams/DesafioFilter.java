package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Lápis", 1.99, 0.35, 0);
		Produto p2 = new Produto("Notebook", 4899.99, 0.32, 0);
		Produto p3 = new Produto("Caderno", 29.99, 0.45, 0);
		Produto p4 = new Produto("Impressora", 1199.99, 0.40, 0);
		Produto p5 = new Produto("Ipad", 3099.99, 0.29, 0);
		Produto p6 = new Produto("Relógio", 1899.99, 0.12, 0);
		Produto p7 = new Produto("Monitor", 899.99, 0.31, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		Predicate<Produto> percentualDesconto = p -> p.desconto >= 0.30;
		Predicate<Produto> frete = p -> p.valorFrete == 0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		Function<Produto, String> oferta = p -> "PROMOÇÃO!!! " + p.nome + " por apenas R$ " + p.preco;
		
		produtos.stream().filter(percentualDesconto).filter(frete).filter(precoRelevante).map(oferta).forEach(System.out::println);
	}
}
