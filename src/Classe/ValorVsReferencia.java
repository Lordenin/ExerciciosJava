package Classe;

public class ValorVsReferencia {
public static void main(String[] args) {

	int a = 2;
	int b = a;  //Atribuição por valor(Tipo primitivo)
	
	a++;
	b++;
	
	System.out.println(a + " ø " + b);
	
	
	//As duas variaveis abaixo apontam para o msm objeto em memória.
	Data d1 = new Data(16,05,1988);
	Data d2 = d1; //Atribuição por referencia(Objeto)
	
	d1.dia = 31;
	d2.mes = 07;
	
	System.out.println(d1.dataFormatada());
	System.out.println(d2.dataFormatada());
	
	voltarDataParaValorPadrao(d2);
	
	System.out.println(d1.dataFormatada());
	System.out.println(d2.dataFormatada());
			int c = 5;
			System.out.println(c);
 }
    static void voltarDataParaValorPadrao(Data d) {
  	d.dia = 1;
  	d.mes = 1;
  	d.ano = 1970;
 }
    static void alterarPrimitivo(int a) {
    a++;	
    	
    }  
}
