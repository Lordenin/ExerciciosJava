package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
@SuppressWarnings({ "rawtypes", "unchecked" }) //Isso serve para tirar as notificaçoes de erros
public static void main(String[] args) {
	
	
	HashSet conjunto = new HashSet();
	
	//A própria collection(conjunto) faz a conversão pois não aceita valores primitivos
	
	conjunto.add(1.22);//Convert: double -> Double 
	conjunto.add(true);
	conjunto.add("Teste");
	conjunto.add(1);
	conjunto.add('x');		
	
	System.out.println("Tamanho é :" + conjunto.size());
	
	//A collection tipo Set não comporta o mesmo tipo de dado
	
	conjunto.add("Teste");//Igual o anterior
	conjunto.add('x');//same 
	
    System.out.println("Tamanho é: "+ conjunto.size());	//Confirmando que não foi adicionado outros elementos
	
	System.out.println(conjunto.remove("teste"));//Não foi removido pois é diferente de 'Teste'
	System.out.println(conjunto.remove("Teste"));//Foi removido
	System.out.println(conjunto.remove('x'));//Foi removido
	System.out.println("Tamanho é :" + conjunto.size());//Tamanho vai para 3 pois removi 2 elementos
	
	//Contais serve para vc identificar se um valor está ou não contido dentro de um conjunto
	
	System.out.println(conjunto.contains('x'));//Não temos mais esse pois foi removido posteriormente
	System.out.println(conjunto.contains(1));//Ainda temos esse
	System.out.println(conjunto.contains(true));//Temos esse valor támbem
	
	
	Set nums = new HashSet();//Um outro médoto para construir um HashSet
		nums.add(1);
		nums.add(2);
		nums.add(3);
	
	System.out.println(nums);//Imprime no console os valores do Set nums
	System.out.println(conjunto);//Imprime os valores do primeiro Set do código
	
	//conjunto.addAll(nums);//União entre dois conjuntos
	conjunto.retainAll(nums);//Mostra apenas os valores iguais entre eles
	System.out.println(conjunto);
	
	conjunto.clear();//Ta bem explicito oq isso faz KKk
    System.out.println(conjunto);
	
 }
}
