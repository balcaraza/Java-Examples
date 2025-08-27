package main;

import java.util.Scanner;

public class EsTriangulo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el lado a: ");
		int a = entrada.nextInt();

		System.out.println("Ingrese el lado b: ");
		int b = entrada.nextInt();

		System.out.println("Ingrese el lado c:");
		int c = entrada.nextInt();

		if (a > 0) {
			if (b > 0) {
				if (c > 0) {
					if (a + b > c) {
						if (a + c > b) {
							if (b + c > a) {
								System.out.println("Es un triangulo");
							} else {
								System.out.println("No es un triangulo");
							}
						} else {
							System.out.println("No es un triangulo");

						}
					} else {
						System.out.println("No es un triangulo");

					}
				} else {
					System.out.println("No es un triangulo");

				}
			} else {
				System.out.println("No es un triangulo");

			}
		} else {
			System.out.println("No es un triangulo");
		}

	}

}
