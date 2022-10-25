package oo.Polimorfismo;

public class Jantar {

	public static void main(String[] args) {
	
		Pessoa convidade = new Pessoa(89.63);
		System.out.println(convidade.getPeso());
		
		//Eu utilizei uma comida já existente para a criação de uma superClasse
		//o correto a se fazer é, criar uma classe chamada comida para as demais comidas
		//Então a classe comida seria a super classe dos alimentos 
		//Arrumei oq eu tinha feito kkkj
		Feijão A1 = new Feijão(0.2);	
		Arroz A2 = new Arroz(0.37);
		
		convidade.Comer(A2);
		convidade.Comer(A1);
		
		System.out.println(convidade.getPeso());
	}
}
