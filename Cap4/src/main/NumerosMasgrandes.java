package main;

import java.util.Scanner;

public class NumerosMasgrandes {
	public static void main(String[] args) {

		// inicializacion
		int contador = 0;
		int mayor1=0;
		int mayor2=0;
		int numero;
		Scanner entrada = new Scanner(System.in);
		// procesamiento

		while (contador < 10) {
			System.out.printf("Escriba el numero %d: ", contador + 1);
			numero = entrada.nextInt();

			if (numero > mayor1) {
			    mayor2 = mayor1;
			    mayor1 = numero;
			} else if (numero > mayor2) {
			    mayor2 = numero;
			}

			
			contador++;

		}

		System.out.printf("Los numeros mas grandes son: %d %d", mayor1, mayor2);
	}
}
