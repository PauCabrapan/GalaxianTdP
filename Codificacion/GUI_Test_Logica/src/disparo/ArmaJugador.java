package disparo;

import personajes.Jugador;

public abstract class ArmaJugador extends Arma{
	
	protected Jugador jugador;

	public ArmaJugador(Jugador j, int d){
		da�o=d;
		jugador=j;
	}
	
	public abstract Disparo createDisparo() ;
}
