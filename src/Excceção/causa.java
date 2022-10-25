package Excceção;

public class causa {

	public static void main(String[] args) {
		try{
			metodoA(null);
		}catch(IllegalArgumentException e) {
			if(e.getCause()!= null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		//uma exceção pode ser causa de outra
	}
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);			
		}catch(Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	
    static void metodoB(Aluno aluno) {
		if(aluno == null) {
			System.out.println("aluno esta NULOOOOOOO	");
		}
		System.out.println(aluno.nome);
	}
}
