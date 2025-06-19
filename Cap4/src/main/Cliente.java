package main;

public class Cliente {
	public double numeroCuenta;
	public double saldoInicial;
	public double articulos;
	public double creditos;
	public double limiteCredito;
	
	
	
	
	public Cliente(double numeroCuenta, double saldoInicial, double articulos, double creditos, double limiteCredito) {
		
		this.numeroCuenta = numeroCuenta;
		this.saldoInicial = saldoInicial;
		this.articulos = articulos;
		this.creditos = creditos;
		this.limiteCredito = limiteCredito;
	}
	public double getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(double numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public double getArticulos() {
		return articulos;
	}
	public void setArticulos(int articulos) {
		this.articulos = articulos;
	}
	public double getCreditos() {
		return creditos;
	}
	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public void nuevoSaldo(){
		double nuevoSaldo =saldoInicial + articulos - creditos;
		if (nuevoSaldo > limiteCredito) {
			System.out.println("Se exedio el limite de credito");
		}else {
			System.out.printf("El nuevo saldo es: %.3f%n", nuevoSaldo);
			
		}
		 
	}
	
	
	
}
