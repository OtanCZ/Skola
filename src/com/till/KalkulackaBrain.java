package com.till;

public class KalkulackaBrain {
    public static int suma(int cislo, int cislo2){
        cislo += cislo2;

        return cislo;
    }

    public static int suma(int cisla[]){
        int cislo = 0;

        for (int i = 0; i < cisla.length; i++) {
            cislo += cisla[i];
        }

        return cislo;
    }

    public static int odecitani(int cislo, int cislo2){
        cislo -= cislo2;
        return cislo;
    }

    public static int odecitani(int cislo, int cisla[]){
        for (int i = 0; i < cisla.length; i++) {
            cislo -= cisla[i];
        }

        return cislo;
    }

    public static int nasobeni(int cislo, int cislo2){
        cislo *= cislo2;

        return cislo;
    }

    public static double deleni(double cislo, double cislo2){
        cislo /= cislo2;

        return cislo;
    }
}
