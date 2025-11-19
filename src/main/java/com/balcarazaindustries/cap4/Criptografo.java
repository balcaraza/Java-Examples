package com.balcarazaindustries.cap4;

public class Criptografo {
    public String encriptar(int numero) {
        if (numero < 1000 || numero > 9999) {
            System.out.println("El número debe ser de 4 dígitos");
            return null;
        }

        int d1 = numero / 1000;
        int d2 = (numero / 100) % 10;
        int d3 = (numero / 10) % 10;
        int d4 = numero % 10;

        // Sumar 7 y obtener el residuo
        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        // Intercambiar 1↔3 y 2↔4
        int temp1 = d1;
        int temp2 = d2;
        d1 = d3;
        d2 = d4;
        d3 = temp1;
        d4 = temp2;

        String cifrado = String.format("%d%d%d%d", d1, d2, d3, d4);
        System.out.printf("El número cifrado es: %s%n", cifrado);
        return cifrado;
    }

    public void desencriptar(String numeroCifrado) {
        if (numeroCifrado == null || numeroCifrado.length() != 4) {
            System.out.println("El número cifrado debe tener 4 dígitos");
            return;
        }

        int d1 = Character.getNumericValue(numeroCifrado.charAt(0));
        int d2 = Character.getNumericValue(numeroCifrado.charAt(1));
        int d3 = Character.getNumericValue(numeroCifrado.charAt(2));
        int d4 = Character.getNumericValue(numeroCifrado.charAt(3));

        // Intercambiar 1y3 y 2y4
        int temp1 = d1;
        int temp2 = d2;
        d1 = d3;
        d2 = d4;
        d3 = temp1;
        d4 = temp2;


        d1 = (d1 + 3) % 10;
        d2 = (d2 + 3) % 10;
        d3 = (d3 + 3) % 10;
        d4 = (d4 + 3) % 10;

        int descifrado = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
        System.out.printf("El número descifrado es: %04d%n", descifrado);
    }
}
