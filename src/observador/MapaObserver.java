package observador;

public class MapaObserver extends AtletaObserver {
 
    public MapaObserver(AtletaSubject dados) {
        super(dados);
    }
 
    @Override
    public void update() {
    	System.out.println("Pontos para o mapa:\nLatitude: " + dados.getState().latitude
                + "%\nLongitude: " + dados.getState().latitude);
    }
 

}
