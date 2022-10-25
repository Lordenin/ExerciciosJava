package Desafio;

//Criar classe comida, pessoa e jantar(main)
//Criar duas comidas, fazer a pessoa comer e imprimir peso antes e dps
//Imprimir no console o quanto a pessoa engordou 
//Classe pessoa vai ter o nome e o peso da pessoa (Nome =String, Peso = Double)
//Classe pessoa vai ter um método chamado comer(vai receber um obj da classe comida)
//Classe comida vai te ro peso e o nome
//Acrescentar o peso da comida a pessoa por meio de um método
public class Jantar {
public static void main(String[] args) {
	
	Pessoa P1 = new Pessoa("Jailson", 82.30);
	
	Comida C1 = new Comida("Bisteca", 0.700);
	Comida C2 = new Comida("Xuleta", 0.689);

	
	System.out.println(P1.apresentar());
	P1.comer(C1);
	System.out.println(P1.apresentar());
			
    System.out.println("");
    
    System.out.println(P1.apresentar());
    P1.comer(C2);
    System.out.println(P1.apresentar());
	
	
 }
}
