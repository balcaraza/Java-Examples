import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int multiplo;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		num2 = teclado.nextInt();
		
		multiplo = num1 % num2;
		
		if(multiplo == 0) {
			System.out.printf("El numero %d es multiplo del numero %d", num1, num2);
		} else {
			System.out.printf("El numero %d no es multiplo del numero %d", num1, num2);
		}
		
	}
}
