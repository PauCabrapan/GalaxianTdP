package personajes;

import java.awt.event.KeyEvent;

public class ArmaJugador {
	
	protected int da�o;
	protected Jugador jugador;

	public ArmaJugador(Jugador j, int d){
		da�o=d;
		jugador=j;
	}
	public Disparo createDisparo() {
		return new DisparoJugador(jugador.getPos().getVecina(KeyEvent.VK_RIGHT), 50, da�o);
	}
	
	public void aumentarDa�o(int i) {
		da�o=+i;
	}
	public int getDa�o() {
		return da�o;
	}
}
