package com.Till;
import java.time.format.DateTimeFormatter;

public class LocalDateTime {
    public static void main(String[] args) {
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.now();
        java.time.LocalDateTime myCustomDateTime = java.time.LocalDateTime.of(1963, 4, 5, 6, 8, 9, 10);
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd // MM // yyy")));

        String isValid = 3 > 2 ? "ano" : "ne";
        System.out.println(isValid);
    }
}