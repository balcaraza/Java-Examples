import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        //2.10
        int x = 2;
        int y = 3;
        System.out.printf("x = %d%n", x);
        System.out.printf("El valor de %d + %d es %d%n", x, x, (x+x));
        System.out.printf("x=");
        System.out.printf("%d = %d%n", (x+y), (y+x));

        //2.13
        x= 7+3*6/2-1;
        System.out.println(x);

        x= 2%2+2*2-2/2;
        System.out.println(x);

        x= (3*9*(3+(9*3/(3))));
        System.out.println(x);


        //2.14
        System.out.println("12 34");
        System.out.print("12");
        System.out.print(" 34");
        System.out.println("");
        System.out.printf("%d%d %d%d", 1,2,3,4);

        //2.15
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int resultado;
        System.out.println("");
        System.out.println("Ingrese el primer entero:");
        num1= teclado.nextInt();
        System.out.println("Ingrese el segundo entero:");
        num2= teclado.nextInt();

        System.out.printf("La suma es %d%n", (num1+num2));
        System.out.printf("La resta es %d%n", (num1-num2));
        System.out.printf("La multiplicacion es %d%n", (num1*num2));
        System.out.printf("El cociente es %d%n", (num1/num2));

        //2.16
        if (num1>num2){
            System.out.printf("%d es mas grande",num1);
        } else if (num2>num1){
            System.out.printf("%d es mas grande",num2);
        } else {
            System.out.println("los numeros son iguales");
        }

        //2.17
        System.out.println("");
        System.out.println("Ingrese el primer entero:");
        num1= teclado.nextInt();
        System.out.println("Ingrese el segundo entero:");
        num2= teclado.nextInt();
        System.out.println("Ingrese el tercer entero:");
        num3= teclado.nextInt();

        System.out.printf("La suma es %d%n", (num1+num2+num3));
        System.out.printf("El promedio es %d%n", ((num1+num2+num3) / 3));
        System.out.printf("La multiplicacion es %d%n", (num1*num2*num3));

        if (num1>num2 && num1>num3){
            System.out.printf("%d es mas grande (num1)",num1);
        } else if (num2>num1 && num2>num3){
            System.out.printf("%d es mas grande (num2)",num2);
        } else if (num1==num2 && num2==num3){
            System.out.println("los numeros son iguales");
        } else {
            System.out.printf("%d es mas grande (num3)",num3);
        }




    }
}
