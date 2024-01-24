package arraylist;

import java.util.ArrayList;

public class RemoveLastObjectExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Adding elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Displaying the ArrayList before removal
        System.out.println("ArrayList before removal: " + stringList);

        // Removing the last object from the ArrayList
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
            System.out.println("Last object removed.");
        } else {
            System.out.println("ArrayList is empty. No object to remove.");
        }

        // Displaying the ArrayList after removal
        System.out.println("ArrayList after removal: " + stringList);
    }
}
