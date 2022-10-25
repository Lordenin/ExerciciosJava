package oo.composição;

public class Carro {

	 final Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
	}
		
	
	void acelerar() {
		if(motor.fatorInjeção < 2.6) {
		motor.fatorInjeção += 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorInjeção > 0.5) {//estabelece um valor minimo como proteção
		motor.fatorInjeção -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
