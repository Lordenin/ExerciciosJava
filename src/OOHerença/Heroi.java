package OOHerença;

public class Heroi extends Jogador{

	public Heroi(int x, int y){
		super(x,y);
	}
	
	
    public boolean atacar(Jogador oponente) {  
	boolean ataque1 = super.atacar(oponente);//usando a herança de uma super classe
	boolean ataque2 = super.atacar(oponente);//usando a herança de uma super classe
	boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
		
   }
}
