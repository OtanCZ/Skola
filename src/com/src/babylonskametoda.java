package com.src;

public class babylonskametoda {
        public static void main(String[] args) {
            int S = 5000;

            /*
            int x[] = new int[10];
            x[0] = S/2;
            */

            /*
            for (int n = 0; n < 9; n++){
                x[n+1] = (x[n] + (S/x[n]))/2;
                System.out.println(x[n+1]);
            }
            */

            int x = S/2;

            for (int n = 0; n < 9; n++){
                x = (x + (S/x))/2;
                System.out.println(x);
            }
    }
}
