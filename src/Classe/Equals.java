package Classe;
//Básicamente se comparado dois objetos de forma convencional isso acarretará em um valor false
//isso acontece pois, quando comparado os objetos vc está comparando o valor em memória deles
//para isso é preciso usar uma estrutura de controle especifica para isso
//que será implementada na classe do objeto
//para mais na frente implementarmos um hash code
public class Equals {
public static void main(String[] args) {
	
	Usuario u1 = new Usuario();
	u1.nome = "Josivaldo";
    u1.email = "JosivaldoPinto@Gmail.com";
	
    Usuario u2 = new Usuario();
	u2.nome = "Josivaldo";
    u2.email = "JosivaldoPinto@Gmail.com";
    
    
    
    
    
    System.out.println(u1 == u2);    
    System.out.println(u1.equals(u2));
    System.out.println(u2.equals(u1));
 }
}
