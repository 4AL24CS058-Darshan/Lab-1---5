package assignment;

import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println("Before insertion: " + list);

        list.offerLast("Pink");

        System.out.println("After inserting 'Pink' at end: " + list);
    }
}
