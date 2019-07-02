package mediator;

public class Gmail extends Pessoa{
	public Gmail(Mediator m) {
		super(m);
	}
	
	@Override
	public void recebido(String conteudo) {
		System.out.println("Conteúdo Recebido"+conteudo);
	}
}
