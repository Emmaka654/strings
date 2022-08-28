package com.belhard.strings;

import static com.belhard.strings.Task1.getString;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter string which contains spaces: ");
        String str = getString("1   kilogram     contains  1000 grams");

        int result = findMaxSpaces(str);

        System.out.println("Max of spaces: " + result);
    }

    public static int findMaxSpaces(String str) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isSpaceChar(str.charAt(i))) {
                count++;
                if (count > max) {
                    max = count;
                }
                if (!Character.isSpaceChar(str.charAt(i + 1))) {
                    count = 0;
                }
            }
        }
        return max;
    }

}
