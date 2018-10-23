package juego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Objetos.Barricada;
import gui.GUI;
import mapa.Celda;
import mapa.Mapa;
import mapa.Nivel;
import mapa.NivelUnico;
import personajes.*;

public class Juego {
	private Jugador jugador;
	private ArrayList<Malo> malos;
	private List<Disparo> disparos;
	private ArrayList<Barricada> obst;
	private Mapa mapa;
	private int tamanioCelda = 50;
	private GUI gui;
	private Score score;
	private Nivel nivel;
	
	public Juego(GUI gui){
		mapa = new Mapa(this, gui.getWidth()/tamanioCelda, gui.getHeight()/tamanioCelda); //hay que modificarlo para poder hacerlo con el archivo
		Celda c = this.mapa.getCelda(0, gui.getHeight()/tamanioCelda/2);
		jugador = new Jugador(c);
		disparos = Collections.synchronizedList(new ArrayList<Disparo>());
		malos = new ArrayList<Malo>();
		obst = new ArrayList<Barricada>();
		score = new Score();
		nivel = new NivelUnico();
		nivel.createEnemies();
		malos = nivel.getEnemies();
		nivel.createObjects();
		obst = nivel.getObjects();
		this.gui = gui;
		this.gui.add(jugador.getGrafico());
		mapa.place(malos);
		for (Malo m : malos)
			this.gui.add(m.getGrafico());
		mapa.placeB(obst);
		for (Barricada b : obst)
			this.gui.add(b.getGrafico());
		gui.add(score);
	}
	
	public void moverEnemigos(){
		for(Malo en : malos){
				en.mover();
				/*
				synchronized (disparos) {
					Disparo d = en.disparar();
					disparos.add(d);
					gui.addDisparo(d);
				}
				*/
		}
	}
	
	public void moverDisparos() {
		synchronized(disparos) {
			for (Disparo d : disparos)
				d.mover();
		}
	}
	
	public void mover(int dir){
		jugador.mover(dir);
	}
	
	public void removerEntidad(Entidad e) {
		synchronized (disparos) {
			disparos.remove(e);
			gui.remover(e.getGrafico());
		}
	}
	
	public void disparoJugador(){
		synchronized(disparos) {
			Disparo d = jugador.disparar();
			disparos.add(d);
			gui.addDisparo(d);
		}
	}
}