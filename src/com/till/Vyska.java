package com.till;

import java.util.Scanner;

public class Vyska {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vyska = scan.nextInt();

        if(vyska < 150){
            System.out.println("lmao si trpaslík");
        }else if(vyska >= 150 && vyska <= 175){
            System.out.println("průměrný");
        }else{
            System.out.println("vysoký pog");
        }

    }
}
