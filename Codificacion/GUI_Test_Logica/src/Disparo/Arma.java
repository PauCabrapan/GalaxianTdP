package Disparo;


public abstract class Arma {

	protected int da�o;
	
	public Arma() {
		
	}
	
	public abstract Disparo createDisparo() ;
	
	public int getDa�o() {
		return da�o;
	}
}
