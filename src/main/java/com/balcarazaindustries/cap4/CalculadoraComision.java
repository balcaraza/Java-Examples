package com.balcarazaindustries.cap4;

import java.util.Scanner;

public class CalculadoraComision {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //inicializacion
        int semana =200;
        double comision = 0;
        double ganaciaSemanalTotal=0;
        double totalDeArticulos=0;

        //procesamiento
        System.out.print("Escriba el valor del articulo o -1 para terminar: ");
        double valorArticulo = entrada.nextDouble();

        while (valorArticulo != -1) {
            totalDeArticulos+= valorArticulo;
            System.out.print("Escriba el valor del articulo o -1 para terminar: ");
            valorArticulo = entrada.nextDouble();


        }

        //finalizacion

        if(totalDeArticulos !=0) {
            ganaciaSemanalTotal= (totalDeArticulos * 0.09) +200;
            System.out.printf("Su ganancia semanal es de: %.2f%n",ganaciaSemanalTotal);
        }
        else {
            ganaciaSemanalTotal =200;
            System.out.printf("Su ganancia semanal es de: %.2f%n",ganaciaSemanalTotal);
        }

    }
}
