package assignment;

import java.util.*;

public class IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original List: " + list);

        
        ListIterator<String> iteratorobj = list.listIterator(1);

        System.out.print("Elements from 2nd position: ");
        while (iteratorobj.hasNext()) {
            System.out.print(iteratorobj.next() + " ");
        }
    }
}
