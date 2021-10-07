package com.src;

import java.util.Scanner;

public class Application {

    public static void calculate(int a, int b, int c) {
        int D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("Tvoje rovnice: " + a + "x² + " + b + "x + " + c + " = 0 nemá řešení!");
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("Tvoje rovnice je: " + a + "x² + " + b + "x + " + c + " = 0.");
            System.out.println("Tvůj výsledek pro x1 je: " + x1 + ".");
            System.out.println("Tvůj výsledek pro x2 je: " + x2 + ".");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Zadej a:");
        int a = Integer.parseInt(scan.nextLine());

        System.out.println("Zadej b:");
        int b = Integer.parseInt(scan.nextLine());

        System.out.println("Zadej c:");
        int c = Integer.parseInt(scan.nextLine());
        calculate(a, b, c);
    }
}