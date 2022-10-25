package Collections;


import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
public static void main(String[] args) {
	
    //Set<String> listaAprovados = new HashSet<>();	//Não gera a lista de forma ordenada
	SortedSet<String> listaAprovados = new TreeSet<>(); //Esse já gera de acordo com a ordem estabelicida
    listaAprovados.add("Ana");
    listaAprovados.add("Xurastei");
    listaAprovados.add("Gerson");
    listaAprovados.add("RIcardo Milas");
    
    for(String candidatos : listaAprovados) {
    	System.out.println(candidatos);
    	
    }
  
    Set<Integer> nums = new HashSet<>();//Não usa-se tipo primitivo para denominar um Set
    nums.add(1);
    nums.add(5982);
    nums.add(2);
    nums.add(11);
    
    for(int nume : nums) {
    	System.out.println(nume);
    }
 }
}
