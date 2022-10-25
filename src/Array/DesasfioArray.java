package Array;

import java.util.Arrays;
import java.util.Scanner;

//quantas notas vc quer informar
//criar um array para receber as notas
//quebrar o algoritimo em dois laços for
//recebido as notas o segundo laço for ir calcular as médias
//no final apresentar a média do aluno
//informar o indice Ex: primeira nota = x, segunda nota = y
//o usuario irá informar as notas e o tamanho do array
public class DesasfioArray {
public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);       //SCANNER PARA CAPTURAR A VARIAVEL A BAIXO
	
	System.out.println("Informe quantas notas vc gostaria de ter:");
	
	int QTDnotas =  entrada.nextInt();              //ESSA VARIAVEL IRÁ DENOMINAR O TAMANHO DO ARRAY
	double[] notasAluno = new double[QTDnotas];     // SERÁ UM ARRAY DOUBLE CONTENDO A VARIAVEL ACIMA
	
	for(int i = 0; i < notasAluno.length; i++) {    //LAÇO FOR QUE PERCORRE TODOS OS ESPAÇOS DO ARRAY EXIBINDO NO CONSOLE
		System.out.print("Informe a nota " + (i +1) +" :" );//QUANDO FAÇO (i +1) É PARA SOMAR O INDICE +1 E IMPRIMIR O ENDEREÇO CORRETO
		notasAluno[i] = entrada.nextDouble();       //CAPTURA A NOTA EM DOUBLE PARA TIRARMOS A MÉDIA NO FINAL
	}
	System.out.println(Arrays.toString(notasAluno));//IMPRIME TODAS AS NOTAS ARMAZENADAS EM ORDEM
	
	double total = 0;                               //TODAL DE DE NOTAS QUE FORAM INSERIDAS
	for(double nota : notasAluno){                  //LAÇO FOR EACH PARA FAZERMOS O CÁLCULO DA MÉDIA
		total += nota;
	}
	double media = total / notasAluno.length;
	System.out.println("A média é" + media + "!");
	
	entrada.close();
 }
}
