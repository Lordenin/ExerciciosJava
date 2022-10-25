package Excceção.personalizadaA;

import Excceção.Aluno;

public class Validar {
	
	private Validar() {}
	
	public static void aluno(Aluno aluno) {
		//01# Exceção do Java
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno não existe");
		}
		//02# Exceção personalizada(Minha)
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("Nome");
		}
		//03# Exceção personalizada(Minha)
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroNegativoException("nota");
		}
	}		
}
