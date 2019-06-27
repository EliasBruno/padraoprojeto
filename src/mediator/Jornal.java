package mediator;

public class Jornal extends Autor{
	public Jornal(Mediator m) {
		super(m);
	}
	
	@Override
	public void revisar(String conteudo) {
		System.out.println("Conteúdo Revisado"+conteudo);
	}
}
