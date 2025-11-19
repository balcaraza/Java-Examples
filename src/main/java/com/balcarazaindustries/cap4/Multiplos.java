package com.balcarazaindustries.cap4;

import java.util.Scanner;

//Este programa imprime un ciclo infinito de las potencias de 2
public class Multiplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int base =2;

        while (base >0) {
            base *=2;
            System.out.println(base);
        }
    }
}
