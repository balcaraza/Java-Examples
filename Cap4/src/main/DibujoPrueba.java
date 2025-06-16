package main;

import javax.swing.JFrame;

public class DibujoPrueba {
	
	public static void main(String[] args) {
		Dibujo1 dibujo = new Dibujo1();
		
		JFrame aplication = new JFrame();
		aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aplication.add(dibujo);
		aplication.setSize(250,250);
		aplication.setVisible(true);
	}

}
