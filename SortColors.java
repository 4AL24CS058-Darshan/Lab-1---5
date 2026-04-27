package assignment;

import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        System.out.println("Before Sorting: " + colors);

        Collections.sort(colors);

        System.out.println("After Sorting: " + colors);
    }
}