package personajes;

import mapa.Celda;

public class ArmaEnemigo {

	protected int da�o;
	protected Malo malo;
	
	public ArmaEnemigo(Malo m, int d) {
		malo=m;
		da�o=d;
	}
	public Disparo createDisparo() {
		return new DisparoEnemigo(malo.getPos().getVecina(Celda.LEFT),10,da�o);
	}

}
