package main;

import java.util.Scanner;

public class EncriptarDesencriptar {
	public static void main(String[] args) {
		Criptografo criptografo =new Criptografo();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero de 4 digitos:");
		int numero= entrada.nextInt();
		
		criptografo.encriptar(numero);
	}

}
