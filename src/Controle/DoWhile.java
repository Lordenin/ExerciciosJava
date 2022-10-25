package Controle;

import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	String texto = "";
	do {
	System.out.println("Qual a senha ? :  ");
	System.out.print("Voce deseja sair?????");
	texto = entrada.nextLine();
	}
	while(!texto.equalsIgnoreCase("Bisteca"));
	
	
	entrada.close();
 }
}
