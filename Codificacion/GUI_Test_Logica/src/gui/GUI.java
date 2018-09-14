package gui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import juego.Juego;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Juego j;
	private ContadorTiempo tiempo;
	private ContadorTiempoJugador tiempoJugador;
	private boolean lock = false;
	private int direction = -1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
					Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
					frame.setBounds(0, 0,(int) d.getWidth(),(int) d.getHeight());
					frame.setResizable(false);
					frame.setSize(d);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				mover(arg0);
			}
		});
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0,(int)d.getWidth(),(int)d.getHeight());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		j = new Juego(this);
		tiempo = new ContadorTiempo(j, this);
		tiempoJugador = new ContadorTiempoJugador(j, this);
		tiempo.start();
		tiempoJugador.start();
		agregarFondo();
	}
	
	protected void mover(KeyEvent key){
		if(!lock){
			direction = key.getKeyCode();
			this.lock = true;
		}
	}
	
	public boolean getLock(){
		return this.lock;
	}
	
	public void toggleLock(){
		this.lock = !this.lock;
	}
	
	public int getDirection(){
		return this.direction;
	}
	public void agregarFondo() {
		JLabel f=new JLabel();
		ImageIcon i=new ImageIcon(this.getClass().getResource("/BattleCity/Desert.jpg"));
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		f.setBounds(0,0,(int)d.getWidth(),(int)d.getHeight());
		f.setIcon(i);
		this.add(f);
	}
}
