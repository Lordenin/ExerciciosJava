package Desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso){ //Construtor
			this.nome = nome;
			this.peso = peso;
	}
	void comer(Comida comida) {    //Método
	if(comida != null) {           //Um teste condicional para receber um valor correto
		this.peso += comida.peso1;} //O += é incrementativo
	}
	String apresentar() {
		return "Olá meu nome é " + nome + " Eu tenho " + peso + "Kg.";
	}
  }

