package com.balcarazaindustries.cap4;

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int fila = 1;

        int dimension = 0;

        System.out.println("Ingrese la dimension del cuadrado: ");

        dimension = entrada.nextInt();

        if (dimension < 1) {
            System.err.println("Error: debe ser entre 1 y 20");
        } else if (dimension > 20) {
            System.err.println("Error: debe ser entre 1 y 20");
        } else {

            while (fila <= dimension) {
                int columna = 1;

                while (columna <= dimension) {

                    if (fila == 1) {
                        System.out.print("*");
                    } else if (fila == dimension) {
                        System.out.print("*");
                    } else {
                        if (columna == 1) {
                            System.out.print("*");
                        } else if (columna == dimension) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    columna++;
                }
                System.out.println();
                fila++;
            }

        }
    }
}
