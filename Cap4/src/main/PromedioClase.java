package main;
//Fig 4.8 promedio de una clase por repeticion controlada por contador
import java.util.Scanner;

public class PromedioClase {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//fase de inicializacion
		int total =0;
		int contadorCalificaciones =1;
		
		//fase de procesamiento
		while(contadorCalificaciones <=10) {
			
			System.out.print("Escriba la calificacion: ");
			int calificacion = entrada.nextInt();
			total = total + calificacion;
			contadorCalificaciones = contadorCalificaciones + 1;
		}
		
		//faase de terminacion
		int promedio =total/10;
		
		
		System.out.printf("%nEl total de las 10 calificaciones es de %d%n", total);
		System.out.printf("El promedio de la clase es de %d%n", promedio);
		
	}
}
