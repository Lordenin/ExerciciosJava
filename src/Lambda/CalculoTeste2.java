package Lambda;
//Forma mais simplis de usar Lambda
public class CalculoTeste2 {

	public static void main(String[] args) {
		//Forma explicita com o par de chaves e o retunr
		Calculo soma = (x,y) -> {return  x + y; };
		System.out.println(soma.Executar(2, 3));

		//forma implicita sem o par de chaves nem o return, pois o Java ja entende oq precisa ser feito
		soma = (x, y) ->  x * y;
		System.out.println(soma.Executar(2, 3));

		
	}
}
