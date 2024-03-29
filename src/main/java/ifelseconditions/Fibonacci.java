package ifelseconditions;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + N + " terms:");
        printFibonacci(N);
    }
    private static void printFibonacci(int N) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
