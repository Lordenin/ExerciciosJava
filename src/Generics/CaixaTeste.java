package Generics;

public class CaixaTeste {
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
	    caixaA.guardar("Secret");
	    
	    String coisaA = (String) caixaA.abrir();
	    System.out.println(coisaA);
		
	    Caixa <Double> caixaB = new Caixa<>();
	    caixaB.guardar(3.415);
	    
	    Double coisaB = (Double) caixaB.abrir();
	    System.out.println(coisaB);
	}
}

