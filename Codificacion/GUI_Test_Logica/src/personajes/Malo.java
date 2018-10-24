package personajes;

import Colliders.*;
import grafica.MaloGrafico;
import mapa.Celda;

public class Malo extends Personaje{
	protected Strategy strat;

	public Malo() {
		super();
		collider=new ColliderMalo();
		hp=50;
		fuerza_kamikaze=50;
		strat=new Buscador(this);
	}
	
	public Malo(Celda pos) {
		super(pos);
		this.grafico = new MaloGrafico(velocidad, this.pos.getX(), this.pos.getY());
		collider=new ColliderMalo();
		hp=50;
		fuerza_kamikaze=50;
		strat=new Paseador(this);
	}

	public void mover(int y) {
		strat.mover(y);
	}
	
	public void moverA(int dir) {
		super.mover(dir);
	}
	public Disparo disparar() {
		Disparo d = new DisparoEnemigo(pos, 100, 5);
		pos.addEntidad(d);
		return d;
		
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
}