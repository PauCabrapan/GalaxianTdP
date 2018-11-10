package Disparo;

import personajes.Jugador;

public class ArmaMisil extends Arma{

	protected int da�o;
	protected Jugador jugador;

	public ArmaMisil(Jugador j, int d){
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
