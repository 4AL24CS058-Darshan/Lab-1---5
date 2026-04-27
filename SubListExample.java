package assignment;

import java.util.*;

public class SubListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        System.out.println("Original List: " + colors);

        List<String> sub = colors.subList(0, 2);

        System.out.println("Extracted (1st & 2nd): " + sub);
    }
}