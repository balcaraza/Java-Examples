public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan","Perez", 1000);
        Empleado empleado2 = new Empleado("Pedro","Lopez", 1500);

        System.out.printf("El sueldo anual de %s %s es de $%.2f%n", empleado1.getNombre(), empleado1.getApellidoPaterno(),
                empleado1.salarioAnual(empleado1.getSalarioMensual()));
        System.out.printf("El sueldo anual de %s %s es de $%.2f%n", empleado2.getNombre(), empleado2.getApellidoPaterno(),
                empleado2.salarioAnual(empleado2.getSalarioMensual()));

        empleado1.aumentarSueldo(0.1);
        empleado2.aumentarSueldo(0.1);

        System.out.printf("El sueldo anual de %s %s es de $%.2f%n", empleado1.getNombre(), empleado1.getApellidoPaterno(),
                empleado1.salarioAnual(empleado1.getSalarioMensual()));
        System.out.printf("El sueldo anual de %s %s es de $%.2f%n", empleado2.getNombre(), empleado2.getApellidoPaterno(),
                empleado2.salarioAnual(empleado2.getSalarioMensual()));

    }
}
