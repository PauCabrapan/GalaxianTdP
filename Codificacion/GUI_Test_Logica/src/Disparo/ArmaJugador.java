package Disparo;

import java.awt.event.KeyEvent;

import personajes.Jugador;

public class ArmaJugador {
	
	protected int da�o;
	protected Jugador jugador;

	public ArmaJugador(Jugador j, int d){
		da�o=d;
		jugador=j;
	}
	public Disparo createDisparo() {
		return new DisparoJugador(jugador.getPos(), 50, da�o);
	}
	
	public void aumentarDa�o(int i) {
		da�o=+i;
	}
	public int getDa�o() {
		return da�o;
	}
}
