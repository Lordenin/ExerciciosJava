package oo.Desafio;
//metodo main
//criar o cliente
//criar os itens
public class ClienteTeste {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneca",9.67, 50);
		compra1.adicionarItem("Xicara",18.60, 25);
		
		Compra compra2 =new Compra();
		compra2.adicionarItem("Iphone",2500.00, 2);
		compra2.adicionarItem("Ipad", 8400.00,6);
		
		Cliente c1 = new Cliente("José da Silva");
		c1.compras.add(compra1);
		c1.compras.add(compra2);
		
		
		System.out.println(c1.obterValorTotal());
		
		
	}

}
