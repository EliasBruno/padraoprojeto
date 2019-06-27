package estado;

public class JogadorPartida implements JogadorState {

	@Override
	public JogadorState titular() {
        System.out.println("Jogador inicia partida jogando");
        return this;
	}

	@Override
	public JogadorState reserva() {
		System.out.println("Jogador inicia partida no banco");
		return this;
	}

	@Override
	public JogadorState contundido() {
		System.out.println("Jogador permanece no departamento médico");
		return this;
	}

	@Override
	public JogadorState suspenso() {
		System.out.println("Jogador não participa da partida");
		
		return this;
	}

}
