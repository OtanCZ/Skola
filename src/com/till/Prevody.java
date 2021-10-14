package com.Till;

import java.util.Scanner;

public class Prevody {
    public static void main(String[] args){
        do{
            Scanner scan = new Scanner(System.in);

            System.out.println("1. 10 => 2.");
            System.out.println("2. 2 => 10");
            System.out.println("3. 10 => 16");
            System.out.println("4. 16 => 10.");
            System.out.println("5. 16 => 2.");
            System.out.println("6. 2 => 16.");
            System.out.println("7. Vypni program.");

            int menuitem = scan.nextInt();
            scan.nextLine();

            if(menuitem == 7){
                return;
            }

            if(menuitem == 1){
                System.out.println("Write a Deciamal number.");
                System.out.println("Here is your Binary number: " + Integer.toBinaryString(scan.nextInt()));
            }

            if(menuitem == 2){
                System.out.println("Write a Binary number.");
                System.out.println("Here is your Decimal number: " + Integer.parseInt(scan.nextLine(),2));
            }

            if(menuitem == 3){
                System.out.println("Write a Decimal number.");
                System.out.println("Here is your Hexademical number: " + Integer.toHexString(scan.nextInt()));
            }

            if(menuitem == 4){
                System.out.println("Write a Hexademical number.");
                System.out.println("Here is your Decimal number: " + Integer.parseInt(scan.nextLine(),16));
            }
        } while(1<2);
    }
}
