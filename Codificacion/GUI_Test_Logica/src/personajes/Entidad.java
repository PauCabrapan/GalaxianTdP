package personajes;

import javax.swing.JLabel;
import Colliders.*;
import grafica.EntidadGrafica;
import mapa.Celda;

public abstract class Entidad {
	protected Celda pos;
	protected EntidadGrafica grafico;
	protected Collider collider;
	protected int velocidad;
	protected int hp;

	protected Entidad() {
		this.grafico = null;
	}

	protected Entidad(Celda pos) {
		this.pos = pos;
		this.grafico = null;
	}

	protected Entidad(Celda pos, int hp) {
		this.pos = pos;
		this.grafico = null;
		this.hp = hp;
	}

	public Celda getPos() {
		return pos;
	}

	public JLabel getGrafico() {
		return this.grafico.getGrafico();
	}

	public void morir() {
		synchronized (pos) {
			pos.eliminarEntidad(this);
			hp = 0;
		}
	}

	public void mover(int dir) {
		synchronized (pos) {
			this.pos.removeEntidad(this);
			Celda next = this.pos.getVecina(dir);
			this.pos = next;
			this.grafico.mover(dir);
			pos.addEntidad(this);
		}
	}

	public void setPos(Celda c) {
		pos = c;
		grafico.setPos(c.getX(), c.getY());
		c.addEntidad(this);
	}

	public boolean isAlive() {
		return hp > 0;
	}

	public abstract void colision(Entidad e);

	public abstract void aceptar(Collider c);

	public abstract void mover();

}