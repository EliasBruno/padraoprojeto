package estado;

public class JogadorTreinamento implements JogadorState{

	@Override
	public JogadorState titular() {
        System.out.println("Jogador participa do treino jogando do lado dos titulares.");
        return this;
	}

	@Override
	public JogadorState reserva() {
        System.out.println("Jogador participa do treino jogando do lado dos reservas.");
        return this;
	}

	@Override
	public JogadorState contundido() {
        System.out.println("Jogador faz treinos isolados de recuperação.");
        return this;
	}

	@Override
	public JogadorState suspenso() {
        System.out.println("Jogador participa do treinamento no time dos reservas.");
        return this;
	}

}
