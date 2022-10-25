package oo.Abstract;

public class TesteAbstract {

	public static void main(String[] args) {
		
		
		Mamifero a = new Cachorro();
		System.out.println(a.andar());
		System.out.println(a.Mamar());
		System.out.println(a.respirar());
	}
}
