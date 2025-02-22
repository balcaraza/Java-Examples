public class Empleado {
    String nombre;
    String apellidoPaterno;
    double salarioMensual;

    public Empleado (String nombre, String apellidoPaterno, double salarioMensual){
        this.nombre = nombre;
        this.apellidoPaterno= apellidoPaterno;
        this.salarioMensual = salarioMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual>0) {
            this.salarioMensual = salarioMensual;
        }
    }
    public double salarioAnual(double salarioMensual){
        return salarioMensual*12;
    }

    public void aumentarSueldo(double porcentajeAumento) {
      salarioMensual =  salarioMensual + (salarioMensual * porcentajeAumento);
    }
}
