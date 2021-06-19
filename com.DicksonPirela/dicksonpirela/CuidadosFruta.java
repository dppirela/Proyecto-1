package com.dicksonpirela;

public abstract class CuidadosFruta {

    public static void abonarFruta(){
        System.out.println("-Se ha abonado la fruta");
    }
    public static void regarFruta(){
        System.out.println("-Se ha regado la fruta");
    }
    public static void limpiarAmbiente(){
        System.out.println("-Se ha limpiado su ambiente");
    }

    static void cuidarFruta(){
        CuidadosFruta.regarFruta();
        CuidadosFruta.abonarFruta();
        CuidadosFruta.limpiarAmbiente();
    }
}
