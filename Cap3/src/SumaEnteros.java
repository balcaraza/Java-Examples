import javax.swing.*;

//Suma de enteros con cuadros de dialgo
public class SumaEnteros {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
        int resultado = num1 +num2;
        String mensaje = String.format("El resultado es %d", resultado);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
