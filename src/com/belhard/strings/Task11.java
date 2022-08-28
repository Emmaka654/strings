package com.belhard.strings;

import static com.belhard.strings.Task1.getString;

public class Task11 {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        String str = getString("Hello world");

        int lowerCase = amountOfLowerCase(str);
        int upperCase = amountOfUpperCase(str);

        System.out.printf("The amount of lowecase: %d, of uppercase: %d", lowerCase, upperCase);
    }

    public static int amountOfLowerCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt((i)))) {
                count++;
            }
        }
        return count;
    }

    public static int amountOfUpperCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt((i)))) {
                count++;
            }
        }
        return count;
    }
}
