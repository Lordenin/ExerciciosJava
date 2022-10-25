package OOHerença.desafio;

public class Mobi extends Carro {

	public Mobi() {
		this(212);
	}
	public Mobi(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	

}
