package com.src;

public class MatrixUtils {
    public static int[][] generateMatrixJednotkova(int width, int height) {
        int output[][] = new int[width][height];

        if(width != height){
            System.err.println("ERROR - Tato matice musí být stejně vysoká i široká.");
            return output;
        }

        for (int j = 0; j < output[0].length; j++) {
            for (int i = 0; i < output.length; i++) {
                if(i==j){
                    output[i][j] = 1;
                }

                else{
                    output[i][j] = 0;
                }
            }

        }

        return output;
    }

    public static void matrixLogger(int matice[][]) {
        for (int j = 0; j < matice[0].length; j++) {
            for (int i = 0; i < matice.length; i++) {
                System.out.print(matice[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] matrixTotal(int matice[][], int matice2[][]) {
        int output[][] = new int[matice.length][matice[0].length];

        if(matice.length != matice.length || matice[0].length != matice2[0].length){
            System.err.println("ERROR - Matice nejsou stejně velké.");
            return output;
        }

        for (int j = 0; j < matice[0].length; j++) {
            for (int i = 0; i < matice.length; i++) {
                output[i][j] = matice[i][j] + matice2[i][j];
            }
        }

        return output;
    }



    public static int[][] generateMatrix(int width, int height, int min, int max) {
        int output[][] = new int[width][height];

        for (int j = 0; j < output[0].length; j++) {
            for (int i = 0; i < output.length; i++) {
                output[i][j] = MathUtils.random(min, max);
            }
        }

        return output;
    }
}
