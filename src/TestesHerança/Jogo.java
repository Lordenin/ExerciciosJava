package TestesHerança;

import OOHerença.Heroi;
import OOHerença.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();	//adicionado via extends ou herança
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10,11);	//adicionado via extends ou herança

		
		
		System.out.println("Monstro tem =>" +monstro.vida);
		System.out.println("Heroi tem => " +heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem =>" + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
	}
}
