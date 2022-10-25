package Classe;

public class DataTeste {
public static void main(String[] args) {

	Data x = new Data(16,07,1999);
	
	Data y = new Data();
	
	
	String dataFormat = y.dataFormatada();
	
	System.out.printf(x.dataFormatada());
	System.out.println();
	System.out.printf(dataFormat);
	
 } 
}
