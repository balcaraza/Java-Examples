package com.balcarazaindustries.cap4;

public class EstudiantePrueba {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Jonh Green", 93.5);
        Estudiante estudiante2 = new Estudiante("Jonh Blue", 72.75);

        System.out.printf("La calificacion en letra de %s es: %s%n",estudiante1.getNombre(), estudiante1.obtenerCalificacionesEstudiante());
        System.out.printf("La calificacion en letra de %s es: %s%n",estudiante2.getNombre(), estudiante2.obtenerCalificacionesEstudiante());

    }
}
