package Excceção;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			gerarErro1();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		try {
			gerarErro2();
		}catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim S2");
		
		
	}
	//Exceção NÃO checada ou NÃO verificada
	static void gerarErro1() {
		throw new RuntimeException("Ocorreu um erro #01");
	}
	//Exceção Checada ou Verificada
	static void gerarErro2() throws Exception{
		throw new Exception("Ocorreu um erro #02");
	}
}
