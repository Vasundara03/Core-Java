package lamdastest;

import junit.framework.TestCase;
import lamdas.OddSquares;

public class OddSquaresTest extends TestCase {

    public void testCalculateAverageOfSquaresOfOddNumbers() {
        OddSquares averageOfSquares = new OddSquares();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double result = averageOfSquares.calculateAverageOfSquaresOfOddNumbers(numbers);
        assertEquals(33.0, result, 0.01);
    }

    public void testCalculateAverageOfSquaresOfOddNumbersWithNoOddNumbers() {
        OddSquares averageOfSquares = new OddSquares();

        int[] numbers = {2, 4, 6, 8};

        double result = averageOfSquares.calculateAverageOfSquaresOfOddNumbers(numbers);

        // Expected result: No odd numbers, so the average is 0.0
        assertEquals(0.0, result, 0.01);
    }

    public void testCalculateAverageOfSquaresOfOddNumbersWithEmptyArray() {
        OddSquares averageOfSquares = new OddSquares();

        int[] numbers = {};

        double result = averageOfSquares.calculateAverageOfSquaresOfOddNumbers(numbers);

        // Expected result: Empty array, so the average is 0.0
        assertEquals(0.0, result, 0.01);
    }
}
