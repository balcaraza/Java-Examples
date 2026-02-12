package com.balcarazaindustries.cap5;
//Fig 5.7: PruebaDoWhile.java
//La instruccion de repeticion do...while
public class PruebaDoWhile {
    public static void main(String[] args) {
        int contador=1;

        do {
            System.out.printf("%d ", contador);
            contador++;
        } while (contador <=10); //fin do...while

        System.out.println();
    }

}
