package com.belhard.strings;

import java.util.Arrays;
import java.util.Scanner;

import static com.belhard.strings.Task1.getString;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        String str = getString("Hello world");

        String result = maxWord(str);

        System.out.println("The longest word in the string: " + result);
    }

    public static String maxWord(String str) {
        int maxLength = 0;
        String maxWord = "";
        String[] masStr = str.split(" ");
        Arrays.sort(masStr);

        for (int i = 0; i < masStr.length; i++) {
            if (masStr[i].length() > maxLength) {
                maxWord = masStr[i];
                maxLength = masStr[i].length();
            }
        }
        return maxWord;
    }

}
