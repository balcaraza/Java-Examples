package main;

public class CalculadoraSaldo {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(0001, 1000, 20,50,2000);
		Cliente cliente2 = new Cliente(0002, 1000, 2000,2000,2000);
		cliente1.nuevoSaldo();
		cliente2.nuevoSaldo();
	}

}
