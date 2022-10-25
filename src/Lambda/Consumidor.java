package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!!!!");
		
		Produto p1 = new Produto("Caneta", 11.99, 0.07);
		Produto p2 = new Produto("Caderno", 29.99, 0.17);
		Produto p3 = new Produto("Borracha", 1.99, 0.05);
		Produto p4 = new Produto("Chevette", 11500.00, 0.67);
		imprimir.accept(p1)	;
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
	}
}
