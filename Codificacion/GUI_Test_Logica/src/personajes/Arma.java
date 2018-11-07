package personajes;

import mapa.Celda;

public class Arma {

	protected int da�o;
	protected Malo malo;
	
	public Arma(Malo m, int d) {
		malo=m;
		da�o=d;
	}
	public Disparo createDisparo() {
		return new DisparoEnemigo(malo.getPos().getVecina(Celda.LEFT),da�o,10);
	}

}
