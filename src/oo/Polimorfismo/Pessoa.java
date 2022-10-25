package oo.Polimorfismo;

public class Pessoa {
	
	private double peso;
	
	Pessoa(double peso){
	if( peso >= 0)
		this.setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void Comer(Comida comida ) {
		this.peso += comida.getPeso();
	}
	
	
	
}
