package Collections;

import java.util.ArrayList;

public class Lista {
	
public static void main(String[] args) {
 
  ArrayList<Usuario> lista = new ArrayList<>();	
  Usuario u1 = new Usuario("Ricardo Eletro");//Posso adicionar um objeto dessa forma, criando uma variavel e add a lista
  lista.add(u1);
	
  lista.add(new Usuario("Berg"));     //Também posso fazer dessa forma criando e já adicionando a lista
  lista.add(new Usuario("Samanthão")); // uma maneira mais rapida e prática
  lista.add(new Usuario("Bisteca"));//Indice 3
  lista.add(new Usuario("Pelé"));
  
  System.out.println(">>>>" + lista.get(3).nome);//Posso pegar pelo indice, percorrendo a lista e mostrando o nome do indice 3
  
  System.out.println("> > > >" + lista.remove(1)); // removendo pelo indice retorna o usuario
  System.out.println(lista.remove(new Usuario("Pelé")));//remove pelo Obj parametrizado pelo Equals e HashCode e retorna Boolean
  System.out.println("Tem :" + lista.contains(new Usuario ("Samanthão")));//metodo que retorna valor boolean para saber se o obj tem na lista
  
  for(Usuario u : lista) {
	  System.out.println(u.toString());//O método toString é chamado implicitamente apenas pelo .nome
  }
 }
}
