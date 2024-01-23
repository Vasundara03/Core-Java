package arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int rotations = 2;

        System.out.println("Original Array:");
        printArray(originalArray);

        rotateleft(originalArray, rotations);

        System.out.println("\nArray after left rotation:");
        printArray(originalArray);
    }

    public static void rotateleft(int[] arr, int rotations) {
        int length = arr.length;
        rotations = rotations % length;

        reverseArray(arr, 0, rotations - 1);
        reverseArray(arr, rotations, length - 1);
        reverseArray(arr, 0, length - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Function to print the elements of the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

