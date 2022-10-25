package Controle;

import java.util.Scanner;

public class SwitchSemBreak {
public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	     System.out.println("Qual sua Graduação: ");
	String faixa = entrada.next();
	
	switch(faixa.toLowerCase()) {
	case "preta":
	System.out.println("Sei o Haduken");
	case "marrom":
		System.out.println("Sei o Xuriuken");
	case "roxa":
		System.out.println("Sei o Mandrakiuken");
	case "verde":
		System.out.println("Sei o Maconhuken");
	case "laranja":
		System.out.println("Sei o Sucouken");
	case "vermelha":
		System.out.println("Sei o Menstrouken");
	case "amarela":
	System.out.println("Sei o Apatiteuken");
	break;
	default:
		System.out.println("Não sei porra nenhuma");
	}
	System.out.println("Fim");
	entrada.close();
 }
}
