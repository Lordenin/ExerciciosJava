package oo.Polimorfismo;

public abstract class Comida {
private double peso;
	
//Uma classe abstrata ou abstract é um classe que não pode ser instanciada
//Ou seja, eu nao consigo criar o objet Comida c1 = new Comida();
//Essa classe só servirá como um molde para as demais
//uma Super Classe


	Comida(double peso){
		if(peso >= 0)
		this.setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}