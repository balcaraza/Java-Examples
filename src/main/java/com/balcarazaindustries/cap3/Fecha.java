package com.balcarazaindustries.cap3;

public class Fecha {int mes;
    int dia;
    int año;

    public Fecha(int dia, int mes, int año) {
        if (mes <=12 && mes >0)
            this.mes = mes;

        if (dia>0 && dia <=7)
            this.dia = dia;

        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void mostrarFecha(int dia, int mes, int año){
        System.out.printf("%02d/%02d/%d", dia,mes,año);
    }
}
