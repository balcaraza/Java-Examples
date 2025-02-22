public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(01,05,1998);
        int dia = fecha1.getDia();
        int mes = fecha1.getMes();
        int año = fecha1.getAño();
        fecha1.mostrarFecha(dia,mes,año);
    }
}
