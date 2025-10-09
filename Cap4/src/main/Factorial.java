package main;

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
}
