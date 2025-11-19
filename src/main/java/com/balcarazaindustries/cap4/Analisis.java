package com.balcarazaindustries.cap4;

import java.util.Scanner;

public class Analisis {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //inicializacion
        int aprobados =0;
        int reprobados =0;
        int contadorEstudiantes =1;

        //Procesa 10 estudiantes usando ciclo controlado por contador

        while (contadorEstudiantes <=10) {
            System.out.print("Escriba el resultado (1 = aprobador, 2 = reprobado): ");
            int resultado = entrada.nextInt();

            //if else anidado
            if (resultado == 1) {
                aprobados = aprobados +1;
                contadorEstudiantes = contadorEstudiantes +1;
            } else if(resultado == 2){
                reprobados = reprobados +1;
                contadorEstudiantes = contadorEstudiantes +1;
            } else {
                System.out.println("Error solo se admiten valores entre 1 y 2");

            }



        }
        //fase de terminacion
        System.out.printf("Aprobados: %d%nreprobados: %d%n", aprobados,reprobados);

        //determina si mas de 8 estudiantes aprobaron
        if(aprobados>8) {
            System.out.println("Bono para el instructor");
        }


    }
}
