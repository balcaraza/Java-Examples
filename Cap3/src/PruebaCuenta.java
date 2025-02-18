// 3.2 PruebaCuenta.java
//Crear y manipular un objeto Cuenta.

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("Jane Green");
		Cuenta cuenta2 = new Cuenta("John Blue");

		//Muestra el valor incial de nombre para cada Cuenta
		System.out.printf("El nombre de cuenta1 es: %s%n", cuenta1.obtenerNombre());
		System.out.printf("El nombre de cuenta2 es: %s%n", cuenta2.obtenerNombre());

	}

}
