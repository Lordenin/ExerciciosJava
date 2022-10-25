package Excceção;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		}catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir");
		}
		
		//Try e catch sempre serão usados juntos
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro" + e.getMessage());
		}
		
		System.out.println("Fim");
	}
		public static void imprimirNomeDoAluno(Aluno aluno) {
			System.out.println(aluno.nome);
		
	
  }
 }

