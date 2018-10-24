package Colliders;

import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.DisparoEnemigo;
import personajes.DisparoJugador;
import personajes.Jugador;
import personajes.Malo;

public class ColliderDisparoEnemigo implements Collider {

	public ColliderDisparoEnemigo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collideWith(Jugador j) {
		j.disminuirHP(10);
	}

	@Override
	public void collideWith(Malo m) {
		//NADA
	}

	@Override
	public void collideWith(DisparoJugador d) {
		// Nada

	}

	@Override
	public void collideWith(DisparoEnemigo de) {
		// Nada

	}

	@Override
	public void collideWith(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collideWith(Premio p) {
		// TODO Auto-generated method stub
		
	}

}
