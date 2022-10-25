package oo.composição;

public class Motor {

	final Carro carro;
	boolean ligado = false;
	double fatorInjeção = 1;
	
	Motor(Carro carro){
		this.carro = carro;
	}

	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return(int) Math.round(fatorInjeção * 3000);
		}
	}
}
