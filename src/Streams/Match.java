package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Juse", 7.2);
		Aluno a2 = new Aluno("jao", 8.2);
		Aluno a3 = new Aluno("Noah", 9.2);
		Aluno a4 = new Aluno("carluxo", 9.2);
		
		List<Aluno>alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno>aprovado = a -> a.nota >=7;
		Predicate<Aluno>reprovado =  aprovado.negate();
		//Match é uma função terminadora
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));

		
	}
}
