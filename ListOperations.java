package assignment;

import java.util.*;

public class ListOperations {

    
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);
    }

  
    public static void addAtIndex(List<String> list) {
        list.add(1, "Mango");
        System.out.println("After adding at index 1: " + list);
    }

    
    public static void addMultiple(List<String> list) {
        List<String> extra = Arrays.asList("Grapes", "Pineapple");
        list.addAll(extra);
        System.out.println("After adding multiple elements: " + list);
    }

    
    public static void accessElements(List<String> list) {
        System.out.println("Element at index 2: " + list.get(2));
    }


    public static void updateElement(List<String> list) {
        list.set(0, "Kiwi");
        System.out.println("After updating element at index 0: " + list);
    }

    
    public static void removeElement(List<String> list) {
        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);
    }

  
    public static void searchElement(List<String> list) {
        boolean found = list.contains("Orange");
        System.out.println("Is 'Orange' present? " + found);
    }

   
    public static void listSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

   
    public static void iterateList(List<String> list) {
        System.out.print("Iterating (for-each): ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

   
    public static void useIterator(List<String> list) {
        System.out.print("Iterating (Iterator): ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

  
    public static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }

    
    public static void subListExample(List<String> list) {
        List<String> sub = list.subList(0, Math.min(2, list.size()));
        System.out.println("Sublist (0 to 2): " + sub);
    }

    
    public static void clearList(List<String> list) {
        list.clear();
        System.out.println("After clearing list: " + list);
    }

    public static void main(String[] args) {

      
        System.out.println("=== ArrayList Operations ===");
        List<String> arrayList = new ArrayList<>();
        performOperations(arrayList);

      
        System.out.println("\n=== LinkedList Operations ===");
        List<String> linkedList = new LinkedList<>();
        performOperations(linkedList);
    }

    
    public static void performOperations(List<String> list) {
        addElements(list);
        addAtIndex(list);
        addMultiple(list);
        accessElements(list);
        updateElement(list);
        removeElement(list);
        searchElement(list);
        listSize(list);
        iterateList(list);
        useIterator(list);
        sortList(list);
        subListExample(list);
        clearList(list);
    }
}
