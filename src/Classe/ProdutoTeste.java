package Classe;

public class ProdutoTeste {
public static void main(String[] args) {
    
	Produto p1 = new Produto("Bistequinha defumada" ,29.99);

	Produto p2 = new Produto();
	p2.nome = "Costelinha na mostarda";
	p2.preço = 59.99;
	
	Produto.desconto = 0.27;
	
	System.out.println(p1.nome);
	System.out.println(p2.nome);
	
	double precoFinal1 = p1.precoComDesconto();
	double precoFinal2 = p2.precoComDesconto();
	double mediaCarrinho = precoFinal1 + precoFinal2 / 2;
	System.out.println(precoFinal1);
	System.out.println(precoFinal2);
	System.out.printf("A média do seu carrinho é = R$%.2f", mediaCarrinho);
	
 }
}