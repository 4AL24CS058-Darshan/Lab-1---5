package assignment;

import java.util.*;

public class StringExercises {

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        String str1 = "   ";
        String mainStr = "Java is fun. Java is powerful. Java is popular.";
        String subStr = "Java";
        String str2 = "Hello";
        String str3 = "A man, a plan, a canal: Panama";
        String str4 = "Java Programming Language";

        System.out.println("Q1: " + isNullOrEmpty(str1));

        System.out.println("Q2: " + countOccurrences(mainStr, subStr));

        System.out.println("Q3: " + reverseString(str2));

        System.out.println("Q4: " + isPalindrome(str3));

        System.out.println("Q5: " + removeWhitespace(str4));
    }
}
