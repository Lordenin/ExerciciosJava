package Classe;

public class Produto {

	String nome;
	double preço;
	static double desconto = 0.25;
	
	Produto(String nomeInicial, double precoInicial){
	    nome = nomeInicial;
		preço = precoInicial;
		
	}
	Produto(){
	
	}
	
	double precoComDesconto() {
	return preço *(1 - desconto);
	}
    double	precoComDesconto(double descontoEspecial) {
    return preço * (1 - desconto - descontoEspecial);
    }
}
