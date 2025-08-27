package main;

import java.util.Scanner;

public class EsTrianguloRectangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a,b,c;
			System.out.println("ingrese el valor de a:");
			a=entrada.nextInt();
			if (a > 0) {
				
				System.out.println("ingrese el valor de b");
				b=entrada.nextInt();
				if (b > 0) {
					
					System.out.println("ingrese el valor de c");
					c= entrada.nextInt();
					if (c > 0) {
						
						int a2 = a*a;
						int b2 = b*b;
						int c2 = c*c;
						
						if(c2== a2 +b2) {
							System.out.println("Es un triangulo rectangulo");
						} else {
							System.out.println("No es un triangulo rectangulo");
						}
					} else {
						System.err.println("No es un triangulo rectangulo -fallo validacion de lado C");
					}
					
				} else {
					System.err.println("No es un triangulo rectangulo - fallo valdiacion de lado B");
				}
				
			} else {
				System.err.println("no es un triangulo rectangulo - fallo validacion del lado A");
			}
			
			

	}

}
