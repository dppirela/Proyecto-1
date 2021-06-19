package com.dicksonpirela;

public class Cuidador {
    String nombre;
    int cedula;
    String horario;

    Cuidador(String nombre, int cedula, String horario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.horario = horario;
    }

    public String toString() {
        return nombre + ", cédula " + cedula + " y turno " + horario;
    }
}
