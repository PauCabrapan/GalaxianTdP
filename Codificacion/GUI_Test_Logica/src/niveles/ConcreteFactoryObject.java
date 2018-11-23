package niveles;

import java.util.ArrayList;
import Objetos.Barricada;
import Objetos.Objeto_precioso;
import Objetos.Obstaculo;
import Objetos.Premio;

public class ConcreteFactoryObject extends AbstractFactoryObject {

	public ArrayList<Barricada> createBarricadas(int cant) {
		ArrayList<Barricada> toRet = new ArrayList<Barricada>();
		for (int i = 0; i < cant; i++)
			toRet.add(new Barricada());
		return toRet;
	}
	
	public ArrayList<Obstaculo> createObstaculos(int cant){
		ArrayList<Obstaculo> toRet= new ArrayList<Obstaculo>();
		for (int i=0 ; i< cant; i++) {
			toRet.add(new Obstaculo());
		}
		return toRet;
	}
}