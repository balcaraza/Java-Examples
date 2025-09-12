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

}
