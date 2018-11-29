package objetos;

import disparo.ArmaMejorada;
import personajes.Jugador;

public class AumentarDa�o extends Premio{

	public AumentarDa�o() {
		super();
	}

	public void actuar(Jugador jugador) {
		System.out.println("Activado Mejora Arma");
		jugador.setArma(new ArmaMejorada(jugador, (jugador.getArma().getDa�o() + 20)));
	}
}