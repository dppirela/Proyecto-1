package com.dicksonpirela;

public class Fruta extends CuidadosFruta {
    String nombre;
    String sabor;
    String epoca;
    String crece;
    int tiempoDeCrecimiento;

    Fruta(){
        this.nombre=nombre;
        this.epoca=epoca;
        this.tiempoDeCrecimiento=tiempoDeCrecimiento;
        this.crece=crece;
        this.sabor=sabor;
    }


    public String toString(){
        return nombre + ": tiene un sabor " + sabor + ", tarda " + tiempoDeCrecimiento+ " en crecer y solo crece en"
                + epoca +", esta crece" + crece + " de la tierra.";}


}
