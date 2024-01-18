package Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] numbers = {0, 2, 0, 1, 3, 4, 0, 5, 0};

        System.out.println("Original Array");
        printArray(numbers);

        moveZerosToEnd(numbers);

        System.out.println("\nArray after moving 0's to the end:");
        printArray(numbers);
    }

    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroIndex++] = num;
            }
        }
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }

    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
