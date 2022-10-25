package Controle;

import java.util.Scanner;

public class EstruturasDeControle {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe a nota: ");
    double media = entrada.nextDouble(); 
	
	if(media <= 10.0 && media >= 7.0) {
	System.out.println("Aprovado!!!");
	System.out.println("Boa carai");
	}
	if(media < 7.0 && media >= 4.5) {
		System.out.println("Recuperação!!!!!");
	}
	if(media < 4.5 && media >= 0.0 ) {
		System.out.println("Si fu deo");
	}
	
	entrada.close();
 }
}
