package mediator;

public class Hotmail extends Pessoa{

	public Hotmail(Mediator m) {
		super(m);
	}
	
	@Override
	public void recebido(String conteudo) {
		System.out.println("Conteúdo Recebido"+conteudo);
	}
}
