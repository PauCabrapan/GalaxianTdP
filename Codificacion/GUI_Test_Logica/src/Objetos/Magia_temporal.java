package Objetos;

import mapa.Celda;
public abstract class Magia_temporal extends Premio {
	
	protected int duracion; //Tiempo que est� activo el bonus.
	
	
	public Magia_temporal(Celda c){
		super(c);
	}
	public Magia_temporal() {
		super();
	}
	
}