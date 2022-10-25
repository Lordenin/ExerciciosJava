package oo.Desafio;

import java.util.ArrayList;

//nome e lista tipo compras
//terá o método obter valor total,para saber quanto o usuario gastou
public class Cliente {

	final String nome;
	
	final ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
