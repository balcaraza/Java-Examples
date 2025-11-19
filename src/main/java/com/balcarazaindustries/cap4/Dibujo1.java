package com.balcarazaindustries.cap4;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Dibujo1 extends JPanel{
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int pasos = 15;
        int ancho = getWidth();
        int altura = getHeight();

        int pasoX = ancho / pasos;   // cuánto avanza en X cada vez
        int pasoY = altura / pasos;  // cuánto sube en Y cada vez

        int i = 1;
        while (i <= pasos) {
            int xFinal = i * pasoX;
            int yFinal = altura - (i * pasoY);  // va subiendo desde abajo
            g.drawLine(0, 0, xFinal, yFinal);
            i++;
        }
        int z = 1;
        while (z <= pasos) {
            int xFinal = z * pasoX;
            int yFinal = altura - (z * pasoY);  // va subiendo desde abajo
            g.drawLine(ancho, altura, xFinal, yFinal);
            z++;
        }
        int w = 1;
        while (w <= pasos) {
            int xFinal = w * pasoX;
            int yFinal = w * pasoY;  // va subiendo desde abajo
            g.drawLine(0, altura, xFinal, yFinal);
            w++;
        }
        int j = 1;
        while (j <= pasos) {
            int xFinal = j * pasoX;
            int yFinal = j * pasoY;  // va subiendo desde abajo
            g.drawLine(ancho, 0, xFinal, yFinal);
            j++;
        }
    }
}
