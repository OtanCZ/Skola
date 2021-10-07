package com.src;

public class ArrayUtils {
    public static int[] arrayRandomNumberFiller(int arrayLength, int min, int max){
        int array[] = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = MathUtils.random(min, max);
        }

        return array;
    }

    public static void arrayLogger(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static int arrayTotal(int array[]){
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return total;
    }

    public static float arrayAverage(int array[]){
        return (float)arrayTotal(array)/array.length;
    }

    public static int[] arraySortedRandomNumberFiller(int arrayLength, int min, int max){
        int array[] = new int[arrayLength];
        int test = (max-min)/arrayLength;

        for (int i = 0; i < array.length; i++) {
            array[i] = MathUtils.random(test*(arrayLength-i), max);
            max = array[i];
        }

        return array;
    }

    public static String caesarCipher(String input, int posun){
        input = input.replace(" ", "").toLowerCase();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            int ascii = (int) character;

            if(ascii+posun > 122){
                output += (char) (96+posun);
            }

            else if(ascii+posun < 97){
                output += (char) (123+posun);
            }

            else{
                output += (char) (ascii+posun);
            }
        }
        return output;
    }

    public static int[] stupidSort(int numbers[]){
        while(!isSorted(numbers)){
            shakeArray(numbers);
        }

        return numbers;
    }

    public static boolean isSorted(int numbers[]){
        int prevValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(prevValue > numbers[i]){
                return false;
            }

            prevValue = numbers[i];
        }

        return true;
    }

    public static int[] shakeArray(int numbers[]){
        int number = 0;
        int index = MathUtils.random(0, numbers.length);
        int index2 = MathUtils.random(0, numbers.length);

        number = numbers[index];
        numbers[index] = numbers[index2];
        numbers[index2] = number;

        arrayLogger(numbers);
        System.out.println("");
        return numbers;
    }

    public static String encrypt(String text, String pass){
        char textChars[] = text.toCharArray();
        char passChars[] = pass.toCharArray();
        int move = 0;

        char encryptedText[] = new char[textChars.length];
        for (int i = 0; i < encryptedText.length; i++) {
            if(passChars.length-move <= i){
                move = -i;
            }

            encryptedText[i] = (char) (textChars[i] ^ passChars[i+move]);
        }

        return new String(encryptedText);
    }
}
