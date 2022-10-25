package Lambda;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		//Conceito de composição de função
		
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par": "Impar";
		
	    Function<String, String> oResultadoE =
	    		valor -> "O resultado é:" + valor;
	    Function<String,String> empolgado =
	    		valor -> valor + "!!!";
	    Function<String,String> duvida =
	    	    valor -> valor + "????";
	    		
	    String resultadoFinal = parOuImpar.
	    		andThen(oResultadoE).
	    		andThen(duvida).apply(32);
	    
	    String resultadoFinal2 = parOuImpar.
	    		andThen(oResultadoE).
	    		andThen(empolgado).apply(33);
	    
	    
	    System.out.println(resultadoFinal);
	    System.out.println(resultadoFinal2);

	    		
	}
}
