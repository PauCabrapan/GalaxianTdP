package personajes;

import grafica.DisparoGrafico;
import mapa.Celda;

public abstract class Disparo extends Entidad{
	protected int dir;
	
	public Disparo(Celda c, int velocidad, int fuerza){
		super(c,velocidad);
		this.grafico = new DisparoGrafico(velocidad, this.pos.getX(), this.pos.getY());
		dir = -1;
		
	}
	
	public void mover(int dir) {
		//super.mover(dir);
		this.pos.removeEntidad(this);
		this.pos =  this.pos.getVecina(dir);
		this.grafico.mover(dir);
		pos.addEntidad(this);
	}
	public void morir() {
		pos.eliminarEntidad(this);
	}
	
}