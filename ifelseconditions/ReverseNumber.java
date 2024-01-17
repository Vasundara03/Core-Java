package ifelseconditions;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();

        int reversedNumber =reverseDigits (inputNumber);

        System.out.println("Reversed Number: " + reversedNumber);
    }

    private static int reverseDigits(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
