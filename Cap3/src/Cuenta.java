//Fig 3.5 Cuenta.java
//Clase Cuenta con un constructor que inicializa el nombre

public class Cuenta {
	
		private String nombre;

		//el contructor inicializa con nombre en el parametro nombre
	public Cuenta(String nombre){
		this.nombre = nombre;
	}
		
		//metodo para establecer nombre en el objeto
		public void establecerNombre(String nombre) {
			this.nombre = nombre; //almacena el nombre
		}
		
		public String obtenerNombre() {
			return nombre; //devuelve el valor del nombre a quien lo invoco.
			
		}	

}
