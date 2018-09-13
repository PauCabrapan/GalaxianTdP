package grafica;

import javax.swing.ImageIcon;

public class JugadorGrafico extends EntidadGrafica{

	public JugadorGrafico(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/Soldier.gif"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/BattleCity/Soldier.gif"));
	//	Las dos siguientes ya no son necesarias
	//	this.image[2] = new ImageIcon(this.getClass().getResource("/BattleCity/left.png"));
	//	this.image[3] = new ImageIcon(this.getClass().getResource("/BattleCity/right.png"));
	}
}