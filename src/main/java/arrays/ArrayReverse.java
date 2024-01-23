package arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] originalArray = {1,2,3,4,5};

        System.out.println("Original Array: ");
        printArray(originalArray);

        reverseArray(originalArray);

        System.out.println("\nReversed Array:");
        printArray(originalArray);
    }
    public static void reverseArray(int[] arr){
        int length = arr.length;
        for(int i= 0; i <length/2; i++){
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
