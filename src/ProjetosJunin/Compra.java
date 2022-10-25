package ProjetosJunin;

import java.util.ArrayList;

public class Compra {
//Essa é a classe compra, ela irá conter um ArrayList das compras feitas pelo cliente;
//Terá um método para adicionar Item e um método mais robusto para melhor performance;
//Terá um método para obeter o valor total da compra do cliente em questão;	

	ArrayList<Item>itens = new ArrayList<>();
	
	void adcionarItem(Produto p,int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	void adcionarItem(String nome,double preço, int quantidade) {
		var produto = new Produto(nome, preço);
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
