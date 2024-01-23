package arrays;

public class FindMinMax {

    public static void main(String[] args) {

        int[] numbers = {2, 6, 8, 5, 4, 3};

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);

        int smallest = numbers[0];
        int largest = numbers[0];
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int num : arr){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int num : arr){
            if(num > max){
                max = num;
            }
        }

        return max;

    }
}
