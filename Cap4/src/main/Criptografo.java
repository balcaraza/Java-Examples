package main;

public class Criptografo {
	public void encriptar(int numero) {
		int cifrado=0;
		if(numero>=1000) {
			if(numero<=9999) {
				int d1 = numero /1000;
		        int d2 = (numero / 100) % 10;
		        int d3 = (numero / 10) % 10;
		        int d4 = numero %10;
		        
		        //Sumar 7 a cada digito obtener residuo del nuevo numero / 10
		        d1 = (d1+7) % 10;
		        d2 = (d2+7) % 10;
		        d3 = (d3+7) % 10;
		        d4 = (d4+7) % 10;
		        
		        //intercambiar 1 y 3 digito y 2 y 4 digito
		        d3=d3*1000;
		        d4=d4*100;
		        d1=d1*10;
		        d2=d2*1;
		        cifrado=d3 +d4 +d1 +d2;
		        System.out.printf("El numero cifrado es: %04d%n",cifrado);
		        
			}
		} else {
			System.out.println("el numero debe ser de 4 digitos");
		}
		
	}
	
	public void desencriptar(int numero) {
		int descifrado=0;
		if(numero>=1000) {
			if(numero<=9999) {
				int d1 = numero /1000;
		        int d2 = (numero / 100) % 10;
		        int d3 = (numero / 10) % 10;
		        int d4 = numero %10;
		        
		        //Sumar 7 a cada digito obtener residuo del nuevo numero / 10
		        d1 = (d1+7) % 10;
		        d2 = (d2+7) % 10;
		        d3 = (d3+7) % 10;
		        d4 = (d4+7) % 10;
		        
		        //intercambiar 1 y 3 digito y 2 y 4 digito
		        d3=d3*1000;
		        d4=d4*100;
		        d1=d1*10;
		        d2=d2*1;
		        cifrado=d3 +d4 +d1 +d2;
		        System.out.printf("El numero cifrado es: %04d%n",cifrado);
		        
			}
		} else {
			System.out.println("el numero debe ser de 4 digitos");
		}
	}

}
