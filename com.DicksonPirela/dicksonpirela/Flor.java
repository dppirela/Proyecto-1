package com.dicksonpirela;

public class Flor implements CuidadosFlor {
    String nombre;
    int tiempoDeCrecimiento;
    double temperatura;
    double tamaño;
    String epoca;

   Flor(){
        this.nombre=nombre;
        this.tamaño=tamaño;
        this.epoca=epoca;
        this.temperatura=temperatura;
        this.tiempoDeCrecimiento=tiempoDeCrecimiento;
    }

    public String toString(){
        return nombre + ": tiene un tamaño de " + tamaño + " cm, crece en " + epoca+ ", debe tener una temperatura de "
                + temperatura +" y tarda en crecer " + tiempoDeCrecimiento + " dias";
    }

}
