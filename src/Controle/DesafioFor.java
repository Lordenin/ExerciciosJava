package Controle;

public class DesafioFor {
public static void main(String[] args) {
	//Método usando o laço for convencional
  String valor = "$";
	
	for(int i = 0; i <= 7; i++) {
	valor += "$";
	System.out.println(valor);
	}
	
	//método usando o laço for sem usar dados numéricos
	
	for(String v = "ø"; !v.equals("øøøøøøøø"); v += "ø") {
	System.out.println(v);
  }	
 }
}