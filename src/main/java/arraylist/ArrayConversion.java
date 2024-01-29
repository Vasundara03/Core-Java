package arraylist;

import java.util.ArrayList;


public class ArrayListInt {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);

        Integer[] intArray = intList.toArray(intList);

        System.out.println("ArrayList element: " + intList );

        System.out.println("ArrayList element: ");
        for (Integer element : intArray) {
            System.out.println(element);
        }
    }
}
