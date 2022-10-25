package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Mercedez ", "Volvo");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> grito = n -> n + "!!!!";
		
		System.out.println("\nUsando Composição");	
		marcas.stream()
		.map(maiuscula)
		.map(primeiraLetra)
		.map(grito)
		.forEach(print);

		//Podemos fazer uma classe para deixar os métodos mais ageis e faceis de instanciar
		//Não pe preciso fazer esse processo todas as vezes
		//basta criar pequenas funçoes
		
	}
}
