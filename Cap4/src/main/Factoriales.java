package main;

import java.util.Scanner;

public class Factoriales {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero a calcular el factorial: ");
		int numero = entrada.nextInt();
		int resultado= factorial.calcularFactorial(numero);
		double euler= factorial.calcularEuler(numero);
		
		System.out.printf("El factorial de %d es %d%n", numero, resultado);
		System.out.printf("La aproximacion de Euler de %d es %f%n", numero, euler);
		System.out.println("Ingrese el valor de x para calcular exponencial de Euler:");
		
		double x=entrada.nextDouble();
		double exponencialEuler= factorial.calcularEulerExponencial(numero, x);
		
		System.out.printf("El exponencial de Euler para %d y x=%f es %f", numero,x,exponencialEuler);
		
		
	}

}
