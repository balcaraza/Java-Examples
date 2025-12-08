package com.balcarazaindustries.cap5;
//Fig 5.6 Interes.java
//Calculo del interes compuesto con for
public class Interes {
    public static void main(String[] args) {
        double monto; //monto depositado al final de cada año
        double principal= 1000.0; // monto inicial antes de los intereses
        double tasa = 0.05; // tasa de interes

        //mostrar encabezados
        System.out.printf("%s%20s%n", "Año", "Monto en deposito");

        //calcula el monto en deposito para cada uno de los diez años
        for (int anio =1; anio <= 10; ++anio) {
            monto = principal * Math.pow(1.0 + tasa, anio);
            System.out.printf("%4d%,20.2f%n", anio, monto);
        }
    }
}
