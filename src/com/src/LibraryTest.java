package com.src;

import java.lang.reflect.Array;

public class LibraryTest {
    public static void main(String[] args) {
        /*
        int a2 = MathUtils.s(40);
        System.out.println(a2);

        int a3 = MathUtils.v(40);
        System.out.println(a3);

        int suma = MathUtils.sum(a2, a3);
        System.out.println(suma);

        double S = MathUtils.kruhObsah(3);
        System.out.println(S);

        double o = MathUtils.kruhObvod(3);
        System.out.println(o);

        long hh = MathUtils.faktorial(25);
        System.out.println(hh);

        boolean sudy = MathUtils.isSudy(4);
        System.out.println(sudy);

        boolean prvocislo = MathUtils.isPrvocislo(10);
        System.out.println(prvocislo);

        int array[] = ArrayUtils.arrayRandomNumberFiller(99, 1, 250);
        ArrayUtils.arrayLogger(array);
        System.out.println(ArrayUtils.arrayTotal(array));
        System.out.println(ArrayUtils.arrayAverage(array));


        int array2[] = ArrayUtils.arraySortedRandomNumberFiller(5, 0, 150);
        ArrayUtils.arrayLogger(array2);


        String notCiphered = "ahoj pojeb sa debil";
        String ciphered = ArrayUtils.caesarCipher(notCiphered, -1);
        System.out.println(ciphered);


        int matice[][] = MatrixUtils.generateMatrix(5, 6, 0, 10);
        int matice2[][] = MatrixUtils.generateMatrix(5, 6, 0, 10);
        int matice3[][] = MatrixUtils.generateMatrixJednotkova(5, 5);


        MatrixUtils.matrixLogger(matice3);
        System.out.println();

        MatrixUtils.matrixLogger(matice);
        System.out.println();

        MatrixUtils.matrixLogger(matice2);
        System.out.println();

        MatrixUtils.matrixLogger(MatrixUtils.matrixTotal(matice, matice2));


        int numbers[] = {2, 1, 3};
        ArrayUtils.arrayLogger(ArrayUtils.stupidSort(numbers));


        String encrytp = ArrayUtils.encrypt("adsadasdasdasdsadadsa", "aa");
        System.out.println(encrytp);

        encrytp = ArrayUtils.encrypt(encrytp, "aa");
        System.out.println(encrytp);
        */

        int toSort[] = {1, 8, 6, 7, 5};
        ArrayUtils.arrayLogger(ArrayUtils.stupidSort(toSort));
    }
}
