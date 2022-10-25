package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Juse", 7.2);
		Aluno a2 = new Aluno("jao", 8.2);
		Aluno a3 = new Aluno("Noah", 9.2);
		Aluno a4 = new Aluno("carluxo", 9.2);
		Aluno a5 = new Aluno("Juse", 7.2);
		Aluno a6 = new Aluno("jao", 8.2);
		Aluno a7 = new Aluno("Noah", 9.2);
		Aluno a8 = new Aluno("carluxo", 9.2);
		
		List<Aluno>alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		System.out.println("");
		
		System.out.println("Skit/Limit");
		alunos.stream()
		.limit(1)
		.skip(2)
		.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("TakeWhile.....");
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
		
		
	}
}
