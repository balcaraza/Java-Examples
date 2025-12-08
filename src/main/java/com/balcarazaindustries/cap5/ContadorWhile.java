package com.balcarazaindustries.cap5;
//Fig 5.1: ContadorWhile.java
//Repeticion controlada por contador, con la instruccion de repeticion while
public class ContadorWhile {
    public static void main(String[] args) {
        int contador=1;

        while (contador <= 10){
            System.out.printf("%d ", contador);
            ++contador; //incrementa la variable de control
        }
        System.out.println();
    }
}
