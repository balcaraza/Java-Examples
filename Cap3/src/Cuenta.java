//Fig 3.8 Cuenta.java
//Clase Cuenta con un constructor que inicializa el nombre

public class Cuenta {
	
		private String nombre;
		private double saldo;


		//Constructor con dos parametros
	public Cuenta(String nombre, double saldo){

		this.nombre = nombre;

		//valida que saldo sea mayor a 0.0, de lo contrario
		//la variable saldo mantiene su valor incial predeterminado de 0.0
		if (saldo >0.0)
			this.saldo = saldo;
	}
	//metodo que deposita (suma) solo una cantidad valida al saldo
	public void depositar(double montoDeposito){
		if (montoDeposito > 0.0)
			saldo = saldo +montoDeposito;
	}
		//metodo que devuelve el saldo de la cuenta
	public double obtenerSaldo(){
		return saldo;
	}

	//metodo que establece el nombre
	public void estableceNombre(String nombre){
		this.nombre = nombre;
	}
	 //metodo que devuelve el nombre
	public String obtenerNombre(){
		return nombre;
	}

	public void retirar(double montoRetirar){
		if (montoRetirar > saldo){
			System.out.println("El monto a retirar excede el saldo de la cuenta");
		} else {
			saldo = saldo-montoRetirar;
		}
	}

}
