package oo.composição;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Predo";
		
		//Fiz um método na classe Compra que facilita a criação de novas instancias
		//levando um método a chamar o outro de moto bi-direcional
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem(new Item("Borracha", 12, 3.89));
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}
}
