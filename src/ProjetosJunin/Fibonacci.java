package ProjetosJunin;

public class Fibonacci {

	public static void main(String[] args) {
	
		int n1 ,n2;
		n1 = 1;
		n2 = 0;
	
	    for(int i = 1; i <14; i++) {
	    	n1 = n1 + n2;
	    	n2 = n1 - n2;
	    	
	    	System.out.println(n1);
	    }		
	}
}
