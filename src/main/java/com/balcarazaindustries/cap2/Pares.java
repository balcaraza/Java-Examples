package com.balcarazaindustries.cap2;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int residuo;

        System.out.println("Ingrese el numero a determinar si es par o impar: ");
        num = teclado.nextInt();
        residuo = num % 2;
        if (residuo == 0){
            System.out.printf("El numero %d es par", num);
        } else {
            System.out.printf("El numero %d es impar", num);
        }
    }
}
