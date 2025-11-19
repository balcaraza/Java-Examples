package com.balcarazaindustries.cap2;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, suma;

        System.out.println("Escriba el primer numero entero");
        numero1= entrada.nextInt();
        System.out.println("Escriba el segundo numero entero");
        numero2= entrada.nextInt();

        suma = numero1 + numero2;

        System.out.printf("La suma es %d%n", suma);

    }
}
