package observador;

public abstract class AtletaObserver {
	protected AtletaSubject dados;
	
	public AtletaObserver(AtletaSubject dados) {
        this.dados = dados;
    }
	 
    public abstract void update();
}
