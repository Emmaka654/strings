package com.belhard.strings;

import java.util.Scanner;

import static com.belhard.strings.Task1.getString;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter string with many spaces: ");
        String str = getString(" String   has too     much spaces.  ");

        String result = deleteExstraSpaces(str);

        System.out.println("Your string without exstra spaces: " + result);
    }

    public static String deleteExstraSpaces(String str) {
        return str.replaceAll("\\s+", " ").trim();
    }
}

