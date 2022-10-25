package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		//LIFO = Last in First out
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Harry Potter");
		livros.push("Bisteca suina 2");
		livros.push("A Curpa é das Star");
		
		//A mesma lógica que se aplica a fila se aplica a pilha devidamente alinhada ao LIFO
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//os "removedores"
		System.out.println(livros.pop());//Também lança uma exceção
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());//Retorna Null
	  //System.out.println(livros.remove()); Retorna exceção

		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
	}
}
