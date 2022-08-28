package com.belhard.strings;

import static com.belhard.strings.Task1.getString;

public class Task12 {
    public static void main(String[] args) {
        System.out.print("Enter string with a few sentences: ");
        String str = getString("Hello world. Hello Java.");

        int result = amountOfSentences(str);

        System.out.printf("The amount of sentences: " + result);
    }

    public static int amountOfSentences(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                count++;
            }
        }
        return count;
    }

}
