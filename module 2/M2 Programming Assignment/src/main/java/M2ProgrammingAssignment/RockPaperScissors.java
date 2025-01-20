package M2ProgrammingAssignment;




import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a Random object to generate the computer's selection
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1; // Generates a number between 1 and 3

        // Prompt the user to enter their selection
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");
        int userChoice = scanner.nextInt();

        // Display the computer's and user's selections
        System.out.println("Computer's choice: " + choiceToString(computerChoice));
        System.out.println("Your choice: " + choiceToString(userChoice));

        // Determine and display the result of the game
        String result = determineWinner(computerChoice, userChoice);
        System.out.println(result);
    }

    // Method to convert choice number to string
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }

    // Method to determine the winner
    public static String determineWinner(int computerChoice, int userChoice) {
        if (computerChoice == userChoice) {
            return "It's a tie!";
        } else if ((computerChoice == 1 && userChoice == 3) ||
                   (computerChoice == 2 && userChoice == 1) ||
                   (computerChoice == 3 && userChoice == 2)) {
            return "Computer wins!";
        } else {
            return "You win!";
        }
    }
}