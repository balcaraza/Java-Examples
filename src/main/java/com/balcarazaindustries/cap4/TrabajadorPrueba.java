package com.balcarazaindustries.cap4;

import java.util.Scanner;

public class TrabajadorPrueba {
    public static void main(String[] args) {
        //Inicializacion
        Scanner entrada = new Scanner(System.in);

        double tarifa=0;

        //Procesamiento
        System.out.println("Ingrese el numero de horas trabajadas o -1 para terminar: ");
        int horas= entrada.nextInt();

        while (horas != -1) {
            System.out.println("Ingrese el precio de la tarifa: ");
            tarifa = entrada.nextDouble();
            Trabajador trabajador = new Trabajador(horas, tarifa);
            double sueldo = trabajador.calcularSueldo();
            System.out.printf("El sueldo del trabajador es: %.2f%n", sueldo);

            System.out.println("Ingrese el numero de horas trabajadas o -1 para terminar: ");
            horas= entrada.nextInt();
        }
        System.out.println("Gracias por usar BALCARAZA INDUSTRIES");

    }
}
