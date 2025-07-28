package main;

import java.util.Scanner;

public class SalidaTabulada {
	public static void main(String[] args) {
		
		int n;
		int contador=1;
		int N10;
		int N100;
		int N1000;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el valor de N");
		n= entrada.nextInt();
		System.out.println("N	10*N	100*N	1000*N");
		
		while (n>=contador) {
			
			N10=contador*10;
			N100=contador*100;
			N1000=contador*1000;
			
			System.out.printf("%d\t %d\t %d\t %d%n",contador,N10,N100,N1000);
			contador++;
			
		}
	}

}
