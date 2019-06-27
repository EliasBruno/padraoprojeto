package mediator;

public class Artigo extends Autor{

	public Artigo(Mediator m) {
		super(m);
	}
	
	@Override
	public void revisar(String conteudo) {
		System.out.println("Conteúdo Revisado"+conteudo);
	}
}
