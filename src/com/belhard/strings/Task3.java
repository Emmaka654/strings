package com.belhard.strings;

import static com.belhard.strings.Task1.getString;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter string which contains numbers: ");
        String str = getString("1 kilogram contains 1000 grams");

        int result = findNumberOfDigits(str);

        System.out.println("The number of digits: " + result);
    }

    public static int findNumberOfDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
