package main;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a,b,c,d,e;
		int n0,n1,n2,n3;
		int numeroInvertido;
		
		int numero = entrada.nextInt();
		
		a=numero/10000;
		n0=numero % 10000;
		
		b=n0/1000;
		n1=n0%1000;
		
		c=n1/100;
		n2=n1%100;
		
		d=n2/10;
		n3=n2%10;
		
		e=n3/1;
		
		numeroInvertido=(e*10000)+(d*1000)+(c*100)+(b*10)+a;
		
		if(numero==numeroInvertido) {
			System.out.printf("El numero ingresado y el inverso son palindromos %d\t%d", numero, numeroInvertido);
		}else {
			System.err.printf("El numero ingresado y el inverso No son palindromos %d\t%d", numero, numeroInvertido);
		}
		
		
	
		
		

	}

}
