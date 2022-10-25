package Lambda;

import java.util.function.Predicate;

public class PredicadoComposisão {
	public static void main(String[] args) {
	
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer>isTresDigitos = num-> num >= 100 && num <=999;
		//uso do and também é auto explicativo
		System.out.println(isPar.and(isTresDigitos).test(222));
		System.out.println(isPar.and(isTresDigitos).test(22));
		//o uso do or auto explicativo
		System.out.println(isPar.or(isTresDigitos).test(222));
		System.out.println(isPar.or(isTresDigitos).test(23));
		//Lembrando que tambem podemos usar negação lógica .negate
	}
}
