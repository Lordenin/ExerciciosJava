package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro {

	public static void main(String[] args) {
	
		Aluno a1 = new Aluno("Ana", 9.7);
		Aluno a2 = new Aluno("Tirulipa", 4.7);
		Aluno a3 = new Aluno("Cleo", 3.7);
		Aluno a4 = new Aluno("Julio", 6.7);
		Aluno a5 = new Aluno("Duilso", 10.0);
		Aluno a6 = new Aluno("Bisteca", 5.7);
		Aluno a7 = new Aluno("Maconha", 7.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7.0;		
		Function<Aluno,String>saudacoesAprovado = 
				a-> "Parabens " + a.nome + " Voce passou";
		
		alunos.stream().filter(aprovados).map(saudacoesAprovado)
		.forEach(System.out::println);	
	}
}
