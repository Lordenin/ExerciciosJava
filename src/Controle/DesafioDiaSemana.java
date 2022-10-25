package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	    System.out.println("Digite o dia: ");
    String dia = entrada.next();
	
	if("domingo".equalsIgnoreCase(dia)) {
	    System.out.println(1);
	}
	if("segunda".equalsIgnoreCase(dia)) {
		System.out.println(2);
		}
	if("terça".equalsIgnoreCase(dia)
			|| "terca".equalsIgnoreCase(dia)) {
		System.out.println(3);
		}
	if("quarta".equalsIgnoreCase(dia)) {
		System.out.println(4);
		}
	if("quinta".equalsIgnoreCase(dia)) {
		System.out.println(5);
		}
	if("sexta".equalsIgnoreCase(dia)) {
		System.out.println(6);
		}
	if("sábado".equalsIgnoreCase(dia)
			||"sabado".equalsIgnoreCase(dia)) {
		System.out.println(7);
		}
	
	entrada.close();
 }
}
