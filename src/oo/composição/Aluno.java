package oo.composição;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	//Método utilizado para procurar um curso a partir de um nome
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	//método usado para converter um objeto para uma String
	public String toString() {
		return nome;
	}
}
