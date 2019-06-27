package mediator;

public abstract class Autor {
	protected Mediator mediator;
	
	public Autor(Mediator m) {
		mediator = m;
	}
	
	public void escrever(String conteudo) {
		mediator.escrever(conteudo, this);
	}
	
	public abstract void revisar(String conteudo);
}
