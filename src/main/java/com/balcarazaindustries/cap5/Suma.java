package com.balcarazaindustries.cap5;
//Fig. 5.5 Suma.java
//sumar enteros con la instruccion for
public class Suma {
    public static void main(String[] args) {
        int total=0;
        //total de los enteros pares del 1 al 20
        for (int numero=2; numero <= 20; numero +=2)
            total += numero;
        System.out.printf("La suma es %d%n", total
        );
    }
}
