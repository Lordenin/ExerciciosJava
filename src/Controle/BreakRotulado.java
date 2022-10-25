package Controle;

public class BreakRotulado {
public static void main(String[] args) {
	
	//rotulamento de laços
	         for(int i = 0; i < 3; i++) {
    externo: for(int j = 0; j< 3; j++) {
	                 if(i == 1) {
	              break externo;
	  }
	  System.out.printf(" %d%d ", i, j);
    }
    System.out.println();
  }
	System.out.println("FIM");
 }
}
