package functionalinterfacetest;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;
import functionalinterface.HashSort;

public class HashSortTest extends TestCase {

    public void testSortByValues() {
        // Create an unsorted map
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("John", 30);
        unsortedMap.put("Alice", 25);
        unsortedMap.put("Bob", 35);
        unsortedMap.put("Charlie", 28);

        // Call the method to be tested
        Map<String, Integer> sortedMap = HashSort.sortByValues(unsortedMap);

        // Expected sorted order based on values
        String[] expectedKeys = { "Bob", "John", "Charlie", "Alice" };
        int[] expectedValues = { 35, 30, 28, 25 };

        // Verify the sorted map
        int i = 0;
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            assertEquals(expectedKeys[i], entry.getKey());
            assertEquals(expectedValues[i], entry.getValue().intValue());
            i++;
             }
    }
}
