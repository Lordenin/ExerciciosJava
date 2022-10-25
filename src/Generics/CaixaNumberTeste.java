package Generics;

public class CaixaNumberTeste {

	public static void main(String[] args) {
		
		CaixaNumber<Double> caixaA = new CaixaNumber<>();
		caixaA.guardar(2589.2);
		System.out.println(caixaA.abrir());
	}
}
