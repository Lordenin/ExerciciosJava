package Classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.1415;
	
	AreaCirc(double raioIni){
		raio = raioIni;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
}
