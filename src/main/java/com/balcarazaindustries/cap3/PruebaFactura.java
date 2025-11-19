package com.balcarazaindustries.cap3;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura1 = new Factura("A1", "Maneral de acero", 2, -17.50);
        System.out.printf("Usted tiene %d pieza(s) con código %s, Descripción: %s y precio de: $%.2f%n",
                factura1.getCantidad(), factura1.getNumPieza(), factura1.getDescripcion(), factura1.getPrecio());

        System.out.println("El costo total es de: " +factura1.obtenerMontoFactura(factura1.getCantidad(), factura1.getPrecio()));


    }
}
