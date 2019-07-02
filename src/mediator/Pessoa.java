package mediator;

public abstract class Pessoa {
	protected Mediator mediator;
	
	public Pessoa(Mediator m) {
		mediator = m;
	}
	
	public void escrever(String conteudo) {
		mediator.escrever(conteudo, this);
	}
	
	public abstract void recebido(String conteudo);
}
