package com.rekurze;

import com.src.ArrayUtils;
import com.src.MathUtils;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(F(5));
        System.out.println(Frecursion(5));
        System.out.println(faktorialRecursion(8));

        int pole[] = ArrayUtils.arrayRandomNumberFiller(10, 0, 10);
        ArrayUtils.arrayLogger(pole);
        ArrayUtils.arrayLogger(quickSort(pole));
        */

        int pole[] = {1, 3, 4, 5, 6, 7, 10};
        System.out.println(numberIndexInSortedArray(pole, 10));
    }

    public static int numberIndexInSortedArray(int numbers[], int toFind){
        int min = 0;
        int max = numbers.length;
        int random = MathUtils.random(min, max);

        if(min == max){
            return -1;
        }

        if(numbers[random] == toFind){
            return random;
        }

        if(numbers[random] > toFind){
            max = random;
            return numberIndexInSortedArray(numbers, toFind);
        }

        if(numbers[random] < toFind){
            min = random;
            return numberIndexInSortedArray(numbers, toFind);
        }

        return -1;
    }

    public static int[] quickSort(int cisla[]){
        int random = MathUtils.random(0, cisla.length);
        int pivot = cisla[random];
        int mensi[] = new int[cisla.length];
        int vetsi[] = new int[cisla.length];

        if(cisla.length <= 1){
            return cisla;
        }

        for (int i = 0; i < cisla.length; i++) {
            if(i == random){
                continue;
            }

            if(cisla[i] > pivot){
                for (int j = 0; j < cisla.length; j++) {
                    if(cisla[j] > pivot){
                        vetsi[j] = cisla[j];
                    }
                }
                return quickSort(vetsi);
            }

            else{
                for (int j = 0; j < cisla.length; j++) {
                    if(cisla[j] <= pivot){
                        mensi[j] = cisla[j];
                    }
                }
                return quickSort(mensi);
            }
        }


        return mensi;
    }



    public static int faktorialRecursion(int pocet){
        if(pocet <= 0){
            return 1;
        }

        return pocet * faktorialRecursion(pocet - 1);
    }

    public static int Frecursion(int pocet){
        if(pocet <= 0){
            return 0;
        }

        if(pocet == 1){
            return 1;
        }

        return Frecursion(pocet - 1) + Frecursion(pocet - 2);
    }

    public static int F(int pocet){
        int prvni = 0;
        int druhy = 1;
        int treti = 0;

        while(pocet > 0){
            treti = prvni;
            prvni += druhy;
            druhy = treti;

            pocet--;
        }

        return prvni;
    }

    public static void recursion() {
        //stop condition
        recursion();
    }
}
