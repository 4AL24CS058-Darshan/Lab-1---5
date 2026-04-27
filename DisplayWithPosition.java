package assignment;

import java.util.*;

public class DisplayWithPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Elements with positions:");

        for (int p = 0; p < list.size(); p++) {
            System.out.println("Position " + p + ": " + list.get(p));
        }
    }
}
