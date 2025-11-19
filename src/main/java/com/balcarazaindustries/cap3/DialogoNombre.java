package com.balcarazaindustries.cap3;
//Fig 3.13 DialogoNombre.java
//Entrada basica con cuadro de dialogo

import javax.swing.*;

public class DialogoNombre {
    public static void main(String[] args) {
        //pedir nombre al usuario
        String nombre = JOptionPane.showInputDialog("Cual es tu nombre?");

        //crear el mensaje
        String mensaje = String.format("Bienvenido, %s, a la programacion en Java", nombre);

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
