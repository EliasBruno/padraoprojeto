package observador;

public class ListaObserver extends AtletaObserver{

	public ListaObserver(AtletaSubject dados) {
		super(dados);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void update() {
        System.out.println("Lista:\n Latitude: " + dados.getState().latitude
                + "\nLongitude: " + dados.getState().longitude + "\nVelocidade: "
                + dados.getState().velocidade);
    }
}
