package ui;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * The GUI is the class that create a window of application.
 *
 */
public class GUI extends JFrame {
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 600;
	
	public GUI() {
		this.setTitle("Docudown");
		this.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.pack();
		this.setLayout(new CardLayout());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
