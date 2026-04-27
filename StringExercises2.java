package assignment;

import java.util.*;

public class StringExercises2 {

    public static String capitalizeWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        if (str.trim().isEmpty()) return 0;
        return words.length;
    }

    public static void main(String[] args) {

        String str1 = "java programming language";
        String str2 = "This is a very long string example";
        String str3 = "123456";
        String str4 = "Java is simple and powerful";

        System.out.println("Q6: " + capitalizeWords(str1));

        System.out.println("Q7: " + truncate(str2, 10));

        System.out.println("Q8: " + isNumeric(str3));

        System.out.println("Q9: " + generateRandomString(8));

        System.out.println("Q10: " + countWords(str4));
    }
}
