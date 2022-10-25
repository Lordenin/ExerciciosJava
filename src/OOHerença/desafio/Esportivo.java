package OOHerença.desafio;

public interface Esportivo {

	//uma interface apenas cria a necessidade de uma classe obdecer e criar determinado método
	//Via de regra uma interface só levará métodos que não terão corpo
	//isso é bom para quando:
	//Eventualmente eu quero implementar um método porém não sei ainda como faze-lo
	//Não entenda a obrigação da interface como algo ruim
	//entenda como: eu irei ter que obedecer determinados métodos na criação do meu sistema
	
    void ligarTurbo();
    void desligarTurbo();
    
}
