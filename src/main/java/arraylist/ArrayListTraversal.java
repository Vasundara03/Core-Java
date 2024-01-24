package arraylist;

import java.util.ArrayList;

public class ArrayListTraversal {

    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Adding elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Traversing the ArrayList using a for loop
        System.out.println("Traversing using for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // Traversing the ArrayList using an enhanced for loop
        System.out.println("\nTraversing using enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
