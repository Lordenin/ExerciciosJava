package Lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> Aprovados = Arrays.asList("Ana","Lia","Bia","Bre");
		
		System.out.println("Forma Tradicional");
		for(String nome: Aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01");
		Aprovados.forEach(nome -> System.out.println(nome + "!!"));
		
		System.out.println("\nMethod Reference #01");
		Aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02");
		Aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02");
		Aprovados.forEach(ForEach::meuImprimir);
	}
	static void meuImprimir(String nome) {
		System.out.println("Roi meu nome é" + nome);
	}
}
