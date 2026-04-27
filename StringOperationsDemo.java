package assignment;

import java.util.*;

public class StringOperationsDemo {

    
    public static void stringCreation() {
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }

    
    public static void lengthAndAccess(String str) {
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
    }

    
    public static void compareStrings() {
        String a = "Java";
        String b = "java";

        System.out.println("Equals: " + a.equals(b));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));
    }

    
    public static void searchString(String str) {
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Contains 'va': " + str.contains("va"));
    }

    
    public static void substringExample(String str) {
        System.out.println("Substring (1 to 4): " + str.substring(1, 4));
    }

    
    public static void stringModification(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));
    }

    
    public static void whitespaceHandling() {
        String str = "   Java Programming   ";
        System.out.println("Before Trim: '" + str + "'");
        System.out.println("After Trim: '" + str.trim() + "'");
    }

    
    public static void concatenation() {
        String s1 = "Hello";
        String s2 = "World";
        String result = s1 + " " + s2;

        System.out.println("Concatenated String: " + result);
    }

    
    public static void splitting() {
        String str = "Apple,Banana,Orange";
        String[] parts = str.split(",");

        System.out.println("Splitted Strings:");
        for (String s : parts) {
            System.out.println(s);
        }
    }

    
    public static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");

        System.out.println("StringBuilder Result: " + sb);
    }

    
    public static void stringFormatting() {
        String name = "John";
        int age = 25;

        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);
    }

    
    public static void validateEmail() {
        String email = "example@gmail.com";

        if (email.contains("@") &&
            email.startsWith("example") &&
            email.endsWith(".com")) {

            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void main(String[] args) {

        stringCreation();

        System.out.println("\n--- Length & Access ---");
        lengthAndAccess("Java");

        System.out.println("\n--- Comparison ---");
        compareStrings();

        System.out.println("\n--- Searching ---");
        searchString("Java");

        System.out.println("\n--- Substring ---");
        substringExample("JavaProgramming");

        System.out.println("\n--- Modification ---");
        stringModification("java");

        System.out.println("\n--- Whitespace ---");
        whitespaceHandling();

        System.out.println("\n--- Concatenation ---");
        concatenation();

        System.out.println("\n--- Splitting ---");
        splitting();

        System.out.println("\n--- StringBuilder ---");
        stringBuilderDemo();

        System.out.println("\n--- Formatting ---");
        stringFormatting();

        System.out.println("\n--- Email Validation ---");
        validateEmail();
    }
}
