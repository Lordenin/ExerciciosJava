package Classe;

public class Usuario {

	String nome;
	String email;
	
	public boolean equals(Object objeto) { //Object é o o Adão das instancias
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
						
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}else {
			return false;
		}
	}
}
//essa é uma lógica simples para comparar se as variaveis de duas instancias são iguais