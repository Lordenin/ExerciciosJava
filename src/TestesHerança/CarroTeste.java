package TestesHerança;

import OOHerença.desafio.Carro;
import OOHerença.desafio.Ferrari;
import OOHerença.desafio.Mobi;

public class CarroTeste {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Carro c2 = new Mobi();
		Ferrari c1 = new Ferrari(360);
				
		System.out.println("Km/h :" + c1.velocidade);
		
		c1.acelerar();
		System.out.println("Km/h :" + c1.velocidade);
		c1.desligarTurbo();
	    c1.ligarAR();
	    c1.acelerar();
	    System.out.println("Km/h :" + c1.velocidade);
	    
	    c1.acelerar();
	    System.out.println("Km/h :" + c1.velocidade);
	    
	
		
		

		
		
		

		
		
		
	}
}
