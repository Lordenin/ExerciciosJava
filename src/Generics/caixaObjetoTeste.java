package Generics;

public class caixaObjetoTeste {

	public static void main(String[] args) {
		
		caixaObjeto caixaA = new caixaObjeto();
		caixaA.guardar(2.3);
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		caixaObjeto caixaB = new caixaObjeto();
		caixaB.guardar("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
	}
}
