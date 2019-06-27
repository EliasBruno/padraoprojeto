package gabarito;

public abstract class Jogo {
	final void partida() {
		reserva();
		titular();
	}
	abstract void reserva();
	abstract void titular();
	
	final void contundido() {
		System.out.println("Departamentno Médico");
	}
}
