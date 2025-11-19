package com.balcarazaindustries.cap4;

public class Factorial {
    public int calcularFactorial(int n) {
        int acumulado = 1;

        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            acumulado *= n;
            n--;
        }
        return acumulado;
    }

    public double calcularEuler(int n) {
        double suma=1;
        double factorial=1;
        int contador =1;

        while (contador<n) {
            factorial=factorial*contador;
            suma=suma+1/factorial;
            contador++;
        }
        return suma;
    }

    public double calcularEulerExponencial(int n, double x) {
        double exponencial=1;
        double factorial=1;
        double potencia=1;
        int contador=1;

        if (n == 0) {
            return 1;
        }

        while(contador<n) {

            potencia= potencia*x;
            factorial=factorial*contador;
            exponencial=exponencial + (potencia/factorial);
            contador ++;
        }
        return exponencial;
    }
}
