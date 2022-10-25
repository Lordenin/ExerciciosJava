package Array;

import java.util.Arrays;

public class Exercicios {
public static void main(String[] args) {

	double[] notasAlunoA = new double[4];
	System.out.println(Arrays.toString(notasAlunoA));// não fumega antes das variaveis
	 
	notasAlunoA[0] = 5.9;
    notasAlunoA[1] = 7.8;		
	notasAlunoA[2] = 9.5;
	notasAlunoA[3] = 3.2;
			
	System.out.println(Arrays.toString(notasAlunoA));// assim fumega
	System.out.println(notasAlunoA[0]);//acessando o primeiro local do array = total-1
	
	double totalAlunoA = 0;
	for(int i = 0; i < notasAlunoA.length;i++) {//estrutura padrão
		totalAlunoA += notasAlunoA[i];
		System.out.println("Sua media e:" + totalAlunoA / notasAlunoA.length);
	}
	
	double[] notasAlunoB = {5.9, 6.9, 8.9, 3.3};//outra possibilidade de criar um array
	
	System.out.println(Arrays.toString(notasAlunoB));
	double totalAlunoB = 0;
	for(int i = 0; i < notasAlunoB.length;i++) {
		totalAlunoB += notasAlunoB[i];
	}
	System.out.println("Sua media e :" + totalAlunoB / notasAlunoB.length);
  }
 }

