package com.balcarazaindustries.cap3;
// 3.2 PruebaCuenta.java
//Crear y manipular un objeto Cuenta.

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        //Muestra el valor saldo inicial de cada objeto
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el moto a depositar para la cuenta1: ");
        double montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo d cuenta1%n%n", montoDeposito);
        cuenta1.depositar(montoDeposito);//suma al saldo de cuenta1

        //muestra saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        System.out.print("Escruba el monto a depositar para la cuenta 2: ");
        montoDeposito = entrada.nextDouble();;
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
        cuenta2.depositar(montoDeposito);

        //muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());

        //intentar retirar dinero

        System.out.println("Ingrese el monto a retirar de cuenta 1");
        double monto = entrada.nextDouble();
        cuenta1.retirar(monto);
        System.out.printf("El saldo final de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());


    }
}
