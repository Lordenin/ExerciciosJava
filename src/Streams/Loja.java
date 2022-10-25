package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Loja {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Coca-cola",8.99,0.13,0);
		Produto p2 = new Produto("Paçoca",0.99,0.01,0);
		Produto p3 = new Produto("Sequisu",500.0,0.23,0);
		Produto p4 = new Produto("Bisteca",6.99,0.73,0);
		Produto p5 = new Produto("Youtubiu",888.90,0.43,0);
		Produto p6 = new Produto("Papel Toalha",12.50,0.23,0);
		Produto p7 = new Produto("Pepsi",7.99,0.33,0);
		Produto p8 = new Produto("Fandangos",10.99,0.11,0);
		Produto p9 = new Produto("Cebola",15.59,0.09,0);
		Produto p10 = new Produto("Cocainum",88.99,0.10,0);
		
		List<Produto>produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
	
		//Filte, filter, map
		Predicate<Produto> superPromo = p -> p.desconto >= 0.10;
		Predicate<Produto> freteGratis = p -> p.frete == 0;
		Predicate<Produto> precoBom = p -> p.preco >= 50;
		
		Function<Produto, String> chamadaPromocional =
				p -> "Aproveite " + p.nome + " Por R$: " + p.preco;
				
		produtos.stream().
		filter(superPromo).
		filter(freteGratis).
		filter(precoBom).
		map(chamadaPromocional).
		forEach(System.out::println);
	}
}
