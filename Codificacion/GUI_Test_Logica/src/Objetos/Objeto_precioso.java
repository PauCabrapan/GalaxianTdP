package Objetos;

import Colliders.ColliderPremio;
import grafica.BonusGrafico;
import mapa.Celda;

public class Objeto_precioso extends Premio {
	
	public Objeto_precioso(Celda c){
		super(c);
		collider=new ColliderPremio(this);
		
	}
	
	public Objeto_precioso(Celda c, int hp){
		super(c,hp);
		collider=new ColliderPremio(this);
	}

	public Objeto_precioso() {
		collider=new ColliderPremio(this);
		this.grafico = new BonusGrafico(velocidad,10, 0);
		
	}

	@Override
	public void mover() {
		super.mover(Celda.LEFT);
		
	}
	
}
