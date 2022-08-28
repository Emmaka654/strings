package com.belhard.strings;

import java.util.Scanner;

import static com.belhard.strings.Task1.getString;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = getString("Hello world");
        System.out.print("Enter letter to find how many times does it repeat in a string: ");
        char ch = scanner.next().charAt(0);

        int result = amountOfLetterRepeat(str, ch);

        System.out.printf("The letter %c repeats %d times", ch, result);
    }

    public static int amountOfLetterRepeat(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt((i)) == ch) {
                count++;
            }
        }
        return count;
    }
}
