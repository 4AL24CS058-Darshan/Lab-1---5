package assignment;

import java.util.*;

public class RemoveNthElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        System.out.println("Original List: " + colors);

        int n = 2; 
        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After removing element at index " + n + ": " + colors);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
