package Colliders;

import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;

public class ColliderJugador implements Collider {

	public ColliderJugador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collideWith(Jugador j) {}

	@Override
	public void collideWith(Malo m) {
		m.morir();
	}

	@Override
	public void collideWith(DisparoJugador d) {}

	@Override
	public void collideWith(DisparoEnemigo de) {
		de.morir();		
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
