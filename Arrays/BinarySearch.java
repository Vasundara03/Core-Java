package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;

        System.out.println("Original Sorted Array:");
        printArray(sortedArray);

        int index = binarySearch(sortedArray, target);

        if (index != -1) {
            System.out.println("\nElement " + target + " found at index: " + index);
        } else {
            System.out.println("\nElement " + target + " not found in the array.");
        }
    }

    // Function to perform Binary Search on the sorted array
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return index
            } else if (arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }

    // Function to print the elements of the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
