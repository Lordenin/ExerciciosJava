package Array;

import java.util.Scanner;

public class Mtriz {
public static void main(String[] args) {
//MATRIZ DE ARRAY MÉDIA DE UMA TURMA
	Scanner entrada = new Scanner(System.in);

	System.out.println("Informe a Quantidade de Alunos:");
	int QTDalunos = entrada.nextInt();
	
	System.out.println("Informe a Quantidade de Notas");
	int QTDnotas = entrada.nextInt();
	
	double[] [] NotasDaTurma = new double [QTDalunos] [QTDnotas]; //uma matriz
	
	double total = 0;
	for(int a = 0; a < NotasDaTurma.length;a++) {//um laço que percorre tanto os alunos quanto as notas
		for(int n = 0; n < NotasDaTurma[a].length; n++) {
			System.out.printf("Informe a nota %d do aluno %d: " , a + 1 , n + 1);
			NotasDaTurma[a] [n] = entrada.nextDouble();
			total += NotasDaTurma[a] [n]; // total = soma de todas as notas para uma futura média
		}
	}
	
	double media = total / (QTDalunos * QTDnotas);//cálculo da média da turma
	System.out.println("A média da turma é" + media);
		
	System.out.println("eéééééée~e~e~e~e´~é~´~e´~e~´~e´~e´~e~´e");
	entrada.close();
 } 
}
