package main;

import java.util.Scanner;

public class Factoriales {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero a calcular el factorial: ");
		int numero = entrada.nextInt();
		int resultado= factorial.calcularFactorial(numero);
		
		System.out.printf("El factorial de %d es %d", numero, resultado);
	}

}
