package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {

	Queue<String> fila = new LinkedList<>();
	
	//Offer e Add -> adicionam elementos na fila
	
	//diferença é o comportamento que ocorre quando a fila está cheia!
	
	fila.add("Ana");//Retorna Null
	fila.offer("Bia");//Lança uma exceção
	fila.add("Carlos");
	fila.offer("Daniel");
	fila.add("Rafaela");
	fila.offer("Gui");
	
	//Peek e Element -> Obter o proximo elemento da fila(Sem remover)
	//Diferença ocorre quando a fila está vazia
	System.out.println(fila.peek());//retorna Null
	System.out.println(fila.peek());
	System.out.println(fila.element());//Lança uma exceção
	System.out.println(fila.element());
	
	
	//Poll e Remove -> Obter o próximo elemento da fila e remove
	//Diferença ocorre quando a fila está vazia
	
	System.out.println(fila.poll());//Retorna Null
	System.out.println(fila.remove());//Lança uma exceção
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.remove());
	
	//fila.size(); Mostra o tamanho da fila
	//fila.clear();O nome já é auto explicativo
	//fila.isEmpty();A fila está vazia ? retorna boolean
	//fila.contains();Determinado elemento está contido na fila? Return boolean
	
 }
}
