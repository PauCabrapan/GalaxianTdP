package Disparo;

import grafica.DisparoGrafico;
import mapa.Celda;
import personajes.Entidad;

public abstract class Disparo extends Entidad{
	protected int dir;
	protected int da�o;
	
	public Disparo(Celda c, int velocidad, int da�o){
		super(c,velocidad);
		this.grafico = new DisparoGrafico(velocidad, c.getX(), c.getY());
		dir = -1;
		this.da�o=da�o;	
	}
	
	public int getDa�o() {
		return da�o;
	}
}