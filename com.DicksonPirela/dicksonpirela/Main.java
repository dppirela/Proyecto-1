package com.dicksonpirela;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenido al Invernadero de Dickson");
        System.out.println("En este invernadero cultivamos flores y frutas");
        System.out.println("Contamos con tres cuidadores, que serian: \n");

        Cuidador c1 = new Cuidador("Dickson Pirela", 27998625, "diurno");
        Cuidador c2 = new Cuidador("John Henao", 27969697, "nocturno");
        Cuidador c3 = new Cuidador("Marco Antonio", 12546875, "diurno");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n");


        System.out.println("Aquí las flores que cultivamos y sus características:\n");

        //Flores


        Flor f1 = new Flor();
        f1.temperatura=36;
        f1.nombre= "Rosa";
        f1.tiempoDeCrecimiento= 15;
        f1.epoca="primavera";
        f1.tamaño=15;
        System.out.println(f1);
        CuidadosFlor.regar();
        CuidadosFlor.cortarEspinas();
        System.out.println("\n");

        Flor f2 = new Flor();
        f2.temperatura=34;
        f2.nombre= "Margarita";
        f2.tiempoDeCrecimiento= 23;
        f2.epoca="verano";
        f2.tamaño=20;
        System.out.println(f2);
        CuidadosFlor.noRegar();
        System.out.println("\n");

        Flor f3 = new Flor();
        f3.temperatura=34;
        f3.nombre= "Girasol";
        f3.tiempoDeCrecimiento= 26;
        f3.epoca="primavera";
        f3.tamaño=120;
        System.out.println(f3);
        CuidadosFlor.regar();
        CuidadosFlor.cortarTallos();
        System.out.println("\n");

        Flor f4 = new Flor();
        f4.temperatura=34;
        f4.nombre= "Tulipan";
        f4.tiempoDeCrecimiento= 11;
        f4.epoca="otoño";
        f4.tamaño=17;
        System.out.println(f4);
        CuidadosFlor.regar();
        System.out.println("\n");

        Flor f5 = new Flor();
        f5.temperatura=34;
        f5.nombre= "Claveles";
        f5.tiempoDeCrecimiento= 17;
        f5.epoca="verano";
        f5.tamaño=15;
        System.out.println(f5);
        CuidadosFlor.regar();
        CuidadosFlor.cortarTallos();

        System.out.println("\n");
        System.out.println("En resumen, las plantas que tenemos son:\n");
        String[] ordenFlores = {f1.nombre, f2.nombre, f3.nombre, f4.nombre, f5.nombre};

        for (int i = 0; i < 5; i++) {
            System.out.println(ordenFlores[i]);
            }

        //Frutas

        System.out.println("\n");
        System.out.println("Las frutas que cultivamos aquí son:");
        System.out.println("\n");

        Fruta fr1 = new Fruta();
        fr1.nombre = "Tomate";
        fr1.epoca = "verano y primavera";
        fr1.tiempoDeCrecimiento= 30;
        fr1.crece= "encima";
        fr1.sabor= "dulce";
        System.out.println(fr1);
        CuidadosFruta.cuidarFruta();
        System.out.println("\n");

        Fruta fr2 = new Fruta();
        fr2.nombre = "Fresa";
        fr2.epoca = "primavera";
        fr2.tiempoDeCrecimiento= 22;
        fr2.crece= "encima";
        fr2.sabor= "dulce o acido";
        System.out.println(fr2);
        CuidadosFruta.cuidarFruta();
        System.out.println("\n");

        Fruta fr3 = new Fruta();
        fr3.nombre = "Piña";
        fr3.epoca = "verano";
        fr3.tiempoDeCrecimiento= 36;
        fr3.crece= "debajo";
        fr3.sabor= "dulce";
        System.out.println(fr3);
        CuidadosFruta.cuidarFruta();
        System.out.println("\n");

        Fruta fr4 = new Fruta();
        fr4.nombre = "Limón";
        fr4.epoca = "primavera";
        fr4.tiempoDeCrecimiento= 32;
        fr4.crece= "encima";
        fr4.sabor= "acido";
        System.out.println(fr4);
        CuidadosFruta.cuidarFruta();
        System.out.println("\n");

        Fruta fr5 = new Fruta();
        fr5.nombre = "Uvas";
        fr5.epoca = "verano";
        fr5.tiempoDeCrecimiento= 24;
        fr5.crece= "encima";
        fr5.sabor= "dulce";
        System.out.println(fr5);
        CuidadosFruta.cuidarFruta();

        System.out.println("\n");
        System.out.println("En resumen, la lista de frutas son: \n");
        String[] ordenFrutas = {fr1.nombre, fr2.nombre, fr3.nombre, fr4.nombre, fr5.nombre};

        for (int i = 0; i < 5; i++) {
            System.out.println(ordenFrutas[i]);
        }
    }
}
