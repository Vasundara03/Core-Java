package ifelseconditions;

public class PatternOutput {
    public static void main(String[] args) {
        int n = 5; // Adjust the value of 'n' as needed

        for (int i = n; i >= 1; i--) {
            // Print '+' characters
            for (int j = 1; j <= n - i; j++) {
                System.out.print("+");
            }

            // Print '-' characters
            for (int j = 1; j <= i; j++) {
                System.out.print("-");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
