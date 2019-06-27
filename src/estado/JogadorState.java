package estado;

public interface JogadorState {
	JogadorState titular();
	JogadorState reserva();
	JogadorState contundido();
	JogadorState suspenso();
}
