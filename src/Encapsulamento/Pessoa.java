package Encapsulamento;

public class Pessoa {

	private int idade;
	private String sobreNome;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	Pessoa(int idade, String nome, String sobreNome){
	    setIdade(idade);
	    setNome(nome);
	    setSobreNome(sobreNome);
	}
	Pessoa(){
		
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);//valor absoluto
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
		
	}
	
	public String toString() {
		return "Olá meu nome é " + getNome() + getSobreNome() + "E eu tenho " + getIdade();
	}
}
