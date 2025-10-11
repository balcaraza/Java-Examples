package main;

import java.util.Scanner;

public class EncriptarDesencriptar {
	public static void main(String[] args) {
		Criptografo criptografo = new Criptografo();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un número de 4 dígitos:");
		int numero = entrada.nextInt();
		
		String cifrado = criptografo.encriptar(numero);
		criptografo.desencriptar(cifrado);
		entrada.close();
	}

}
