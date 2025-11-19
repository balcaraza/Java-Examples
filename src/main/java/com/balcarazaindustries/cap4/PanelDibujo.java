package com.balcarazaindustries.cap4;

import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int anchura = getWidth();
        int altura = getHeight();

        g.drawLine(0, 0, anchura, altura);
        g.drawLine(0, altura, anchura, 0);

    }
}
