package ProjetosJunin;

import java.util.ArrayList;

public class Cliente {
//Essa é a classe do cliente, irá conter o construtor do mesmo;
//Essa classe também irá conter o método para obter valor total da compra por exemplo;
//Também irá conter uma ArrayList paras as comrpas feitas pelo cliente;
	
	final String nome;
	
	final ArrayList<Compra>compras = new ArrayList<>();

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
