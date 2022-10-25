package Streams;

public class Munição {

    static final double gravidade = 9.81;
	final String nome;
	final double massa;
	final double velocidade;
	final double canoArma;
	
	
    public Munição(String nome, double massa, double velocidade,double canoArma) {
	  this.nome = nome;
	  this.massa = massa;
	  this.velocidade = velocidade;
	  this.canoArma = canoArma;
  }
     double Calc1() {
    	
    	double vI = velocidade / 2;
    	double T = vI / canoArma;
    	double Acceleration = velocidade / T;
    	double F = massa * Acceleration;
    	double KGf = F / gravidade;
    	return KGf;
    }
   	
    

  }
 