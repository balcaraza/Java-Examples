import java.util.Scanner;

public class SepararEnteros {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("ingrese un numero de 5 digitos");
        int numero= teclado.nextInt();

        int d1= numero/10000;
        int d2 = (numero /1000)%10;
        int d3 = (numero / 100) % 10;
        int d4 = (numero / 10) % 10;
        int d5 = numero %10;


        System.out.println(d1 + "    " + d2 + "    " + d3 + "    " + d4 + "    " + d5);

    }
}
