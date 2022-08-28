package com.belhard.strings;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter string in camelCase: ");
        String str = getString("camelCaseIsSet");

        String result = toSnakeCase(str);

        System.out.println("Your string in snake_case: " + result);
    }

    public static String getString(String defaultValue) {
        Scanner scanner = new Scanner(System.in);
        String str;
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
        } else {
            str = defaultValue;
            System.out.println("You entered something wrong. The default valur was set: " + defaultValue);
        }
        return str;
    }

    public static String toSnakeCase(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                sb.append("_");
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        str = sb.toString();
        str = str.toLowerCase();
        return str;
    }
}
