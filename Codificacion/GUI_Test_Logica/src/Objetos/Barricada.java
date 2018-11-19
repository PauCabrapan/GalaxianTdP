package Objetos;

import Colliders.Collider;
import Colliders.ColliderBarricada;
import grafica.BarricadaGrafica;
import mapa.Celda;
import personajes.Entidad;

public class Barricada extends Objeto{
	
	public Barricada() {
		grafico=new BarricadaGrafica(velocidad,0,0);
		collider = new ColliderBarricada(this);
		hp = 100;
	}
	
	public Barricada(Celda c){
		super(c);
		c.setObstaculo(true);
		grafico = new BarricadaGrafica(velocidad, c.getX(), c.getY());
		collider = new ColliderBarricada(this);
		hp = 100;
	}
	
	public Barricada(Celda c, int hp){
		super(c,hp);
		c.setObstaculo(true);
		grafico=new BarricadaGrafica(velocidad, c.getX(),c.getY());
		collider = new ColliderBarricada(this);
		hp = 100;
	}

	public void colision(Entidad e) {
		e.aceptar(collider);
	}

	public void aceptar(Collider c) {
		c.collideWith(this);
	}

	public void setGrafico() {
		this.grafico = new BarricadaGrafica(velocidad, pos.getX(), pos.getY());		
	}
	
	public void recibirDaņo(int dmg) {
		hp -= dmg;
		if (hp < 0)
			morir();
	}
	
	public void mover() {}
	
	public void morir(){
		pos.setObstaculo(false);
		super.morir();
	}
}