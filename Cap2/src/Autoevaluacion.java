import java.util.Scanner;

public class Autoevaluacion {
    public static void main(String[] args) {
        //Programa para calcular el producto de tres enteros
        //a)
        Scanner entrada = new Scanner(System.in);
        int x,y,z;

        System.out.println("Escriba el primer numero entero");
       x = entrada.nextInt();
        System.out.println("Escriba el segundo numero entero");
        y = entrada.nextInt();
        System.out.println("Escriba el tercer numero entero");
        z = entrada.nextInt();

        int producto = x*y*z;
        System.out.printf("El producto es: %d%n", producto);
    }
}
