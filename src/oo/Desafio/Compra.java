package oo.Desafio;

import java.util.ArrayList;

//terá uma lista de items
public class Compra {

	final ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	void adicionarItem(String nome, double preço,int quantidade) {
		var produto = new Produto(preço, nome);	
		this.itens.add(new Item(produto, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preço;
		}
		
		return total;
	}
}
