package Objetos;

import Disparo.ArmaMejorada;
import personajes.Jugador;

public class AumentarDaņo extends Premio{

	public AumentarDaņo() {
		super();
	}

	public void actuar(Jugador jugador) {
		System.out.println("Activado Mejora Arma");
		jugador.setArma(new ArmaMejorada(jugador, (jugador.getArma().getDaņo() + 20)));
	}
}