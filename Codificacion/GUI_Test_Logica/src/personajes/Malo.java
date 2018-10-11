package personajes;

import java.util.Random;

import Colliders.*;
import grafica.MaloGrafico;
import mapa.Celda;

public class Malo extends Personajes{
	
	public Malo(Celda pos) {
		super(pos);
		this.grafico = new MaloGrafico(velocidad, this.pos.getX(), this.pos.getY());
		collider=new ColliderMalo();
		hp=50;
		fuerza_kamikaze=50;
	}

	public void mover() {
		Random r = new Random();		
		int dir = r.nextInt(4);		
		int direccion = -1;
		switch (dir) {
			case 0 : //Arriba
				direccion = Celda.UP;
				break;
			case 1 : //Abajo
				direccion = Celda.DOWN;
				break;
			case 2 : //Izquierda
				direccion = Celda.LEFT;
				break;
			case 3 : //Derecha
				direccion = Celda.RIGHT;
				break;
		}
		this.pos.removeEntidad(this);
		super.mover(direccion);
		this.pos.addEntidad(this);
	}
	
	//a�adir metodo para disparar
	
	
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
}