package com.balcarazaindustries.cap4;

import java.util.Scanner;

public class TableroDamas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int contadorRenglones=1;

        //inicializacion
        System.out.println("ingrese el tamaño del renglon: ");
        int tamañoTablero= entrada.nextInt();


        //procesamiento

        while (contadorRenglones<= tamañoTablero) {

            int contadorRenglon=1;

            while ((contadorRenglon <= tamañoTablero)) {
                //si renglon es par
                if ((contadorRenglones % 2) != 0) {
                    System.out.print("*");
                    System.out.print(" ");
                } else {
                    //si renglon es impar
                    System.out.print(" ");
                    System.out.print("*");
                }

                contadorRenglon++;

            }
            System.out.println();
            contadorRenglones++;
        }
    }
}
