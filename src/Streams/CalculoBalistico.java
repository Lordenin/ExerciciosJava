package Streams;
public class CalculoBalistico {
	public static void main(String[] args) {
		//double vI = velocidade / 2;
    	//double T = vI / canoArma;
    	//double Acceleration = velocidade / T;
    	//double F = massa * Acceleration;
    	//double KGf = F / gravidade;
    	//return KGf;
		
		//Formula = E = M(massa)/2.(V*2)(velocidade ao quadrado) / 1000
		//Resultado será em Joules
		Munição m1 = new Munição("Ak-47" ,0.0149, 253, 0.127);
	
		double vI = m1.velocidade / 2;
		double T = m1.canoArma / vI;
		double acceleration = m1.velocidade / T;
		double F = m1.massa * acceleration;
		double KGf = F / Munição.gravidade;
		
	
		
		System.out.printf("Velocidade ini: %.1f\n", vI);
		System.out.printf("Tempo: %.3f\n", T);
		System.out.printf("Aceleracao: %.2f\n", acceleration);
		System.out.printf("Força: %.2f\n", F);
	    System.out.printf("KG: %.2f\n", KGf);
	   
	}
}
