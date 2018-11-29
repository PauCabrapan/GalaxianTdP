package Disparo;

import personajes.Jugador;

public abstract class ArmaJugador extends Arma{
	
	protected int da�o;
	protected Jugador jugador;

	public ArmaJugador(Jugador j, int d){
		da�o=d;
		jugador=j;
	}
	
	public abstract Disparo createDisparo() ;
}
