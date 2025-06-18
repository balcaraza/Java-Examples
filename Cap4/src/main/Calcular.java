package main;

public class Calcular {

	public static void main(String[] args) {
		int x=1;
		int suma =0;
		
		while (x<=10) {
			suma += x;
			x++;
		}
		System.out.printf("La suma es: %d%n", suma);

	}

}
