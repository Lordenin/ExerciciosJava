package OOHerença.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	boolean ligarTurbo = false;
	boolean ligarAR = false;
    //public para que possa ser acessado de outro pacote

	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	//public para que possa ser acessado de outro pacote
	public Ferrari() {
		this(300);
	}
	
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	public void desligarTurbo() {
	    ligarTurbo = false;
	}
	public void ligarAR() {
		ligarAR = true;
	}
	
	public void desligarAR() {
		ligarAR = false;
	}
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAR) {
			return 35;
		}else if(ligarTurbo && ligarAR) {
			return 30;
		}else if(!ligarTurbo && !ligarAR) {
			return 20;
		}else return 15;
	}
	
}
