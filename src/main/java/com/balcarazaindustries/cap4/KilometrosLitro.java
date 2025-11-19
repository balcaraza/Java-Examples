package com.balcarazaindustries.cap4;

import java.util.Scanner;

public class KilometrosLitro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //fase de inicializacion
        double contadorKilometros =0;

        //fase de procesamiento
        System.out.print("Escriba el kilometraje del viaje o -1 para terminar: ");
        int kilometros = entrada.nextInt();

        while (kilometros != -1) {

            System.out.print("Escriba el consumo en Litros del viaje: ");
            int litros = entrada.nextInt();
            double consumo = (double) kilometros/litros;
            contadorKilometros += consumo;
            System.out.printf("El consumo de este viaje fue de: %.2f Km/L%n", consumo);

            System.out.println("Escriba el kilometraje del viaje o -1 para terminar: ");
            kilometros = entrada.nextInt();

        }
        if (contadorKilometros != 0) {
            System.out.printf("El total de Km/L es de: %.2f Km/L %n", contadorKilometros);
        } else {
            System.out.println("No se introdujeron datos de viajes");
        }

    }
}
