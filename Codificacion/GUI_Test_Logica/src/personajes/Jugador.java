package personajes;

import java.awt.event.KeyEvent;
import grafica.JugadorGrafico;
import mapa.Celda;

public class Jugador extends Entidad{

	public Jugador(int velocidad, Celda pos) {
		super(velocidad+2, pos);
		this.grafico = new JugadorGrafico(velocidad, this.pos.getX(), this.pos.getY());
	}
	
	public Jugador(Celda pos) {
		super(pos);
		this.grafico = new JugadorGrafico(velocidad, this.pos.getX(), this.pos.getY());
	}

	public void mover(int dir){
		this.pos.setJugador(null);
		switch (dir){
		case KeyEvent.VK_UP : //Arriba
			super.mover(KeyEvent.VK_UP);
			break;
		case KeyEvent.VK_DOWN : //Abajo
			super.mover(KeyEvent.VK_DOWN);
			break;
		case KeyEvent.VK_SPACE :
			//aqu� va el disparo
			break;
		}
		this.pos.setJugador(this);
	}
	
	//a�adir metodo para disparar
}
