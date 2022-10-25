package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Juse", 7.2);
		Aluno a2 = new Aluno("jao", 8.2);
		Aluno a3 = new Aluno("Noah", 9.2);
		Aluno a4 = new Aluno("carluxo", 9.2);
		
		List<Aluno>alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno>piorNota = (aluno1, aluno2)->{
			if(aluno1.nota > aluno2.nota)return -1;
			if(aluno1.nota < aluno2.nota)return 1;
			return 0;
		};
		Comparator<Aluno>melhorNota = (aluno1, aluno2)->{
			if(aluno1.nota > aluno2.nota)return 1;
			if(aluno1.nota < aluno2.nota)return -1;
			return 0;
		};
		System.out.println(alunos.stream().max(melhorNota));
		System.out.println(alunos.stream().min(piorNota));
		
		System.out.println(alunos.stream().min(melhorNota));
		System.out.println(alunos.stream().max(piorNota));
	}
}
