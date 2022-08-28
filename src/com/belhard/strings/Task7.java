package com.belhard.strings;

import static com.belhard.strings.Task1.getString;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Enter string which contains a: ");
        String str = getString("1   kilogram     contains  1000 grams");

        String result = insertBAfterA(str);

        System.out.println("New string (insert b after a): " + result);
    }

    public static String insertBAfterA(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                sb.append(str.charAt(i));
                sb.append("b");
            } else {
                sb.append(str.charAt(i));
            }
        }
        str = sb.toString();
        return str;
    }
}
