package com.balcarazaindustries.cap4;

import java.util.Scanner;

public class BinarioADecimal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroDecimal=0;
        int digitoBinario=0;
        int potencia2=1;

        System.out.println("ingrese el numero binario: ");
        int numeroBinario=entrada.nextInt();

        if(numeroBinario!=0) {

            while (numeroBinario>0) {
                //extraer ultimo digito
                digitoBinario= numeroBinario % 10;
                numeroDecimal += digitoBinario * potencia2;

                //actualizar Nbinario
                numeroBinario = numeroBinario / 10;
                potencia2 *=2;
            }
            System.out.printf("El numero ingresado es %d en decimal",numeroDecimal);
        } else{
            System.out.println("El numero ingresado es 0 en decimal");
        }

    }
}
