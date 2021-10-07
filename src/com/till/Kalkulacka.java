package com.till;

public class Kalkulacka {
    public static void main(String[] args) {
        int cisla[] = {3, 5, 6, 8, 7, 1, 6, 8, 7, 1, 6, 8, 7, 1};

        System.out.println(KalkulackaBrain.suma(3, 5));
        System.out.println(KalkulackaBrain.suma(cisla));

        System.out.println(KalkulackaBrain.odecitani(2579, 74));
        System.out.println(KalkulackaBrain.odecitani(2579, cisla));

        System.out.println(KalkulackaBrain.nasobeni(2579, 84));

        System.out.println(KalkulackaBrain.deleni(2579, 1000));
    }
}
