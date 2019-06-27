package observador;

import java.util.ArrayList;

public class AtletaSubject {
	protected ArrayList<AtletaObserver> observers;
    protected Atleta dados;
    
	public AtletaSubject() {
        observers = new ArrayList<AtletaObserver>();
    }
 
    public void attach(AtletaObserver observer) {
        observers.add(observer);
    }
 
    public void detach(int indice) {
        observers.remove(indice);
    }
    
    public void setState(Atleta dados) {
        this.dados = dados;
        notifyObservers();
    }
     
    private void notifyObservers() {
        for (AtletaObserver observer : observers) {
            observer.update();
        }
    }
     
    public Atleta getState() {
        return dados;
    }
}
