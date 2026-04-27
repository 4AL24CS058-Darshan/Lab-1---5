package assignment;

import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original List: " + list);

        Iterator<String> it = list.descendingIterator();

        System.out.print("Reverse Order: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
