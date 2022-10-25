package Classe;

public class Data {

	int dia;
	int mes; 
	int ano;
	
	Data(){
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970);//posso usar o this como construtor, porem apenas
		                 //em um construtor e apenas em um para não entrar em loop
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia; //usado para resolver conflitos de parametros com o msm nome
		this.mes = mes;
		this.ano = ano;
	}
	
	
	String dataFormatada() {
	return String.format("%d/%d/%d",dia ,mes ,ano);
	}
}
