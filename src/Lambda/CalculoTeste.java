package Lambda;

public class CalculoTeste {
//FORMA TRADICIONAL DE USAR LAMBDA
	public static void main(String[] args) {

		Calculo calculo = new Somar();
		System.out.println(calculo.Executar(2, 3));
		
		calculo = new Multiplicação();
		System.out.println(calculo.Executar(2, 3));

	}
}
