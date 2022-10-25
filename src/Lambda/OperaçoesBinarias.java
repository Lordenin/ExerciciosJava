package Lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperaçoesBinarias {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.7, 7.5));
		
		//Essa função faz as duas coisas juntas;
		BiFunction<Double, Double, String> resultado = (n1, n2)-> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal  >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado.apply(7.9,8.8 ));
		
		
		//Função que usa consegue pegar o resultado de outra função para gerar outro resultado.
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado":"Reprovado";
		System.out.println(media.andThen(conceito).apply(7.8, 5.6));
		
		
		
		
		
	}
}
