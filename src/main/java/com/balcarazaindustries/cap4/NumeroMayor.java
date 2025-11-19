package com.balcarazaindustries.cap4;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        //inicializacion
        int contador=0;
        int mayor =0;
        int numero=0;
        Scanner entrada = new Scanner(System.in);
        //procesamiento

        while (contador <10) {
            System.out.printf("Escriba el numero %d: ", contador+1);
            numero = entrada.nextInt();

            if (numero>mayor) {
                mayor = numero;
            }
            contador++;


        }

        System.out.printf("El mayor de los numeros es: %d", mayor);


    }
}
