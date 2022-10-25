package OOHerença.desafio;

public class Carro {

	
	final int VELOCIDADE_MAXIMA;
	public int velocidade = 0;//a variavel precisa estar visivel para outro pacote por meio do public
	private int delta = 5;
    //como não foi usado o construtor de carro eu posso deixar ele protected para que só possa ser acessado dentro do pacote
   protected Carro(int velocidadeMaxima){
    	VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
		
	//Preciso deixar os métodos dessa classe public para que possa ser acessado de outro pacote

	public void acelerar() {
		if(velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {
		velocidade += getDelta();
		}
	}
	//Preciso deixar os métodos dessa classe public para que possa ser acessado de outro pacote
	public void freiar() {
		if(velocidade >= getDelta()) {
			velocidade -= getDelta();
		}else {
			velocidade = 0;
		}	
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
}
