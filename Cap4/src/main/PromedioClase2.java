package main;

import java.util.Scanner;

public class PromedioClase2 {
	public static void main(String[] args) {
		
		
		
		//Leer entrada
		Scanner entrada = new Scanner(System.in);
		
		//Fase de inicializacion
		int total =0;
		int contador =0;
		
		//fase de procesamiento
		
		System.out.print("Escriba la calificacion o -1 para terminar: ");
		int calificacion = entrada.nextInt();
		
		//itera hasta recibir el valor de centinela del usuario
		while (calificacion != -1) {
			
			total = total + calificacion;
			contador = contador + 1;
			
			//pedir entrada de calificaciones
			System.out.println("Escriba la calificacion o -1 para terminar: ");
			calificacion = entrada.nextInt();
			
		}
		
		//fase de terminacion
		if (contador !=0) {
			
			double promedio = (double) total / contador;
			
			
			
			System.out.printf("%nEl total de las %d calificaciones introducidas es %d%n", contador, total);
			System.out.printf("El promedio de la clase es de %.2f%n", promedio);
			
		} else 
			System.out.println("N"
					+ "o se introdujeron calificaciones");
	}

}
