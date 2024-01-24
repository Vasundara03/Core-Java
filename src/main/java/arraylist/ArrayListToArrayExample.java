package arraylist;

import java.util.ArrayList;

public class ArrayListToArrayExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Adding elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Converting ArrayList to Array
        String[] stringArray = stringList.toArray(new String[0]);

        // Displaying the ArrayList
        System.out.println("ArrayList elements: " + stringList);

        // Displaying the Array
        System.out.println("Array elements: ");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
