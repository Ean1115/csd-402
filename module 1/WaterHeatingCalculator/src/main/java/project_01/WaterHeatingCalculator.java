package project_01;

// Masoner 01/10/2025 M1 Program Assignment CSD402
import java.util.Scanner;

public class WaterHeatingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the amount of water in kilograms
        System.out.println("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt the user to enter the initial temperature in Celsius
        System.out.println("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Prompt the user to enter the final temperature in Celsius
        System.out.println("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate the energy needed
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.printf("The energy needed to heat the water is %.2f joules.%n", energy);
    }
}