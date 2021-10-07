package com.src;

public class MathUtils {

    /**
     *
     ***/

    public static int s(int a) {
        return a * a;
    }

    public static int v(int a) {
        return s(a) * a;
    }

    /**
     * sečte 2 inty
     *
     * @param a
     * @param b
     * @return
     **/

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double kruhObsah(int r) {
        return (Math.PI * (r * r));
    }

    public static double kruhObvod(int r) {
        return ((2 * Math.PI) * r);
    }

    public static long faktorial(int a) {
        long result = 1;

        while (a > 0) {
            result = result * a;
            a--;
        }

        return result;
    }

    public static int random(int min, int max){
        return (int)(min + (Math.random()*(max-min)));
    }

    public static boolean isSudy(int a) {
        return a % 2 == 0;
    }

    public static boolean isPrvocislo(int a) {
        for (int i = 2; i < a; i++) {
            if(a %i == 0){
                return false;
            }
        }
        return true;
    }
}
