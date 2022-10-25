package ProjetosJunin;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
	Compra compra1 = new Compra();
	compra1.adcionarItem("Arroz",15.99,3);
	compra1.adcionarItem("Feijão",18.95, 2);
	compra1.adcionarItem("Bisteca",7.95,4);
	compra1.adcionarItem("Ervilha",4.99,3);
	compra1.adcionarItem("Fini",12.99,1);
	Compra compra2 = new Compra();
	compra2.adcionarItem("Energético Bally",8.99,3);
	compra2.adcionarItem("Balalayka,",29.99,1);
	compra2.adcionarItem("Amarula",109.00,1);
	
	Cliente c1 = new Cliente("Ricardinho Bola Tensa");
	c1.compras.add(compra1);
	c1.compras.add(compra2);
	
    System.out.println(c1.obterValorTotal());
	
		
	
	
	}
}