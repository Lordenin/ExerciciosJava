package Capitulo1;

public class OperadoresLogicos {
public static void main(String[] args) {
	
	//Trabalho na Terça V ou F
	//Trabalho na Quinta V ou F
	 boolean trabalho1 = true;
	 boolean trabalho2 = false;
	 
	 
	  boolean comprouTV50 = trabalho1 && trabalho2;
      boolean comprouTV32 = trabalho1 ^ trabalho2;	
	  boolean comprouSorvete = trabalho1 || trabalho2;
	  
	//OperADOR UNÁRIO
	
	boolean maisSaudavel = !comprouSorvete;
	
	System.out.println("Comprou TV 50 ?" + comprouTV50);
	System.out.println("Comprou TV 32 " + comprouTV32);
	System.out.println("Comprou sorvete "+ comprouSorvete);
	System.out.println("Mais saudavel " + maisSaudavel);
	
	
 }
}
