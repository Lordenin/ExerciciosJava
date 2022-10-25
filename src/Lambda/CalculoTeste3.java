package Lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
	
		//int -> Double : NÃO PODE
		//double -> Double: Pode, pq o Double é um double de classe e não um primitivo
		
		BinaryOperator<Double> soma = (x,y) -> {return  x + y; };
		System.out.println(soma.apply(2.0, 3.0));

	
		BinaryOperator<Integer> bisteca = (x,y) -> {return  x + y; };
		System.out.println(bisteca.apply(2, 3));

		
	}
}
