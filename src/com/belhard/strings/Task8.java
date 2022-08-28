package com.belhard.strings;

import static com.belhard.strings.Task1.getString;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Enter string to know if it is a palindrom: ");
        String str = getString("Anna");

        boolean result = isPalindrom(str);

        System.out.println("Palindrom? " + result);
    }

    public static boolean isPalindrom(String str) {
        StringBuffer sb = new StringBuffer(str.substring(str.length() / 2));
        sb = sb.reverse();
        String partStr = sb.toString();
        str = str.substring(0, str.length() / 2);
        if (str.equals(partStr)) {
            return true;
        } else {
            return false;
        }
    }
}
