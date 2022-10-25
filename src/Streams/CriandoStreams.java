package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		//Método #01
		Stream<String> langs = Stream.of(" Java ","Lua ", "JS\n ");
		langs.forEach(print);
		//Método #02
		String[] maisLangs = {"Phyton ", "Lisp ", "Pearl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs,1 , 4).forEach(print);//Esse método tem um limete de a cordo com o indice.
		//Método #03
		List<String> outrasLangs = Arrays.asList("C ", "PHP ","Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.stream().parallel().forEach(print);
		
		//Esse aqui de baixo cria um laço infinito usando Stream
		//Stream.generate(()-> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
		
	}
}
