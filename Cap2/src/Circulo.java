import java.util.Scanner;

import static java.lang.Math.PI;

public class Circulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el radio a calcular: ");
        int radio = teclado.nextInt();

        int diametro = 2 * radio;
        double pi = PI;
        double circunferencia = 2 * pi * radio;
        double area = pi * (radio *radio);


        System.out.printf("El diametro es: %d%n" +
                "La circunferencia es de: %.2f%n" +
                "El area es de: %.2f", diametro, circunferencia,area);
    }
}
