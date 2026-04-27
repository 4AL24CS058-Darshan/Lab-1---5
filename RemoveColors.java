package assignment;

import java.util.*;

public class RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        System.out.println("Original List: " + colors);

        
        colors.remove(1);

        
        colors.remove("Blue");

        System.out.println("After removals: " + colors);
    }
}
