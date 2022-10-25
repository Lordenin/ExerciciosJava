package OOHerença.desafio;

public interface Luxo {

	
	void ligarAR();
    void desligarAR();	
    
//o Default aplicado dentro de uma interface, define que quem herda não é obrigado a
//Implementar esse método, fazendo com que ele não seja uma obrigação.    
    
    
    default int potenciaDoAR() {
    	return 1;
    }
}
