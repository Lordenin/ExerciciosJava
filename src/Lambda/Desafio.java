package Lambda;
import java.util.function.Function;
import java.util.function.UnaryOperator;
public class Desafio {
// * 1.A partir do Produto calcular o preço real(Com desconto)
// * 2.Imposto Municipal: >= 2500(8,5%) / < 2500(Isento)
// * 3.Frete: >= 3000 (100) / < 3000 (50)
// * 4.Arredondar: Deixar duas casas decimais	
// * 5.Formatar: R$: 1234,56	
	public static void main(String[] args) {
	
		Function<Produto, Double> precoFinal = 
				p -> p.preco * (1 - p.desconto);
				
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
				
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
				
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
				
		Function<Double, String> formatar = 
				preco -> ("R$:"+preco).replace(".", ",");
	
				Produto p = new Produto("Ipad",3235.89, 0.10);
		
		String preco = precoFinal.
				andThen(impostoMunicipal).
				andThen(frete).
				andThen(arredondar).
				andThen(formatar).apply(p);
		
		System.out.println("O preço final é " + preco);
	
	}
}
