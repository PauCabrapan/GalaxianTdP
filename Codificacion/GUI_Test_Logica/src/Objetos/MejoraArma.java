package Objetos;

import personajes.Jugador;

public class MejoraArma extends Premio{

	public MejoraArma() {
		super();
	}

	public void actuar(Jugador jugador) {
		jugador.getArma().aumentarDa�o(20);
	}
}