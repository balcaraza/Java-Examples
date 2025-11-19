package com.balcarazaindustries.cap4;

public class Trabajador {
    int horasTrabajadas;
    double tarifa;

    public Trabajador(int horasTrabajadas, double tarifa) {

        this.horasTrabajadas = horasTrabajadas;
        this.tarifa = tarifa;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }


    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    public double getTarifa() {
        return tarifa;
    }


    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }


    public double calcularSueldo() {
        double sueldo;
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * tarifa;
        } else {
            sueldo = (40 * tarifa) + ((horasTrabajadas-40)*tarifa*1.5);
        }
        return sueldo;
    }
}
