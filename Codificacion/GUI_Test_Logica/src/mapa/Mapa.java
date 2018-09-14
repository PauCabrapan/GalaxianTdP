package mapa;

public class Mapa {
	private Celda mapa[][];
	private int width, height;
	//a�adir un atributo FileOpener para poder abrir el archivo y leerlo, hay que ver bien como hacer funcionar esto

	public Mapa(int width, int height){ //habr�a que modificar esto para que seg�n nuestra implementaci�n el mapa reciba el int del nivel que tiene q crear
		this.width = width;
		this.height = height;
		this.mapa = new Celda[width][height];
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				this.mapa[i][j] = new Celda(this, i, j);
			}
		}
	}
	
	public Celda getCelda(int x, int y){
		if (x >= this.width){
			if (y >= this.height)
				return this.mapa[this.width-1][0];
			else if (y < 0)
				return this.mapa[this.width-1][this.height-1];
			else
				return this.mapa[this.width-1][y];
		}
		else if (x < 0){
			if (y >= this.height)
				return this.mapa[this.width-1][0];
			else if (y < 0)
				return this.mapa[this.width-1][this.height-1];
			else
				return this.mapa[this.width-1][y];
			
		}
		else{
			if (y >= this.height)
				return this.mapa[x][0];
			else if (y < 0)
				return this.mapa[x][this.height-1];
			else
				return this.mapa[x][y];
			
		}
	}
	
	public Celda[][] getMapa() {
		return mapa;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
