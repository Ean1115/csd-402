package M3ProgrammingAssignment;

public class PatternGenerator {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pattern

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("   ");
            }

            // Print the numbers in the pattern
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }
            for (int j = i - 1; j >= 0; j--) {
                num /= 2;
                System.out.print(num + " ");
            }

            // Print the @ symbol
            System.out.println(" @");
        }
    }
}
