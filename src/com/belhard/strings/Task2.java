package com.belhard.strings;

import static com.belhard.strings.Task1.getString;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter string which contains word black: ");
        String str = getString("Black ocean is really beautiful in black night!");

       String result = str.replaceAll("[bB][lL][aA][cC][kK]", "white");

       System.out.println("Changed black to white: " + result);
    }
}
