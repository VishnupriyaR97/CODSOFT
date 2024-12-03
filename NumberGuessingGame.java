import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
	
	    public static void main(String[] args) {
	        // Create a scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Create a Random object to generate random numbers
	        Random random = new Random();

	        // Generate a random number between 1 and 100
	        int numberToGuess = random.nextInt(100) + 1;
	        int userGuess = 0;
	        int numberOfTries = 0;

	        // Welcome message
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I have selected a number between 1 and 100.");
	        System.out.println("Try to guess it!");

	        // Start the game loop
	        while (userGuess != numberToGuess) {
	            System.out.print("Enter your guess: ");
	            // Get the user's guess
	            userGuess = scanner.nextInt();
	            numberOfTries++;

	            // Check if the guess is too high, too low, or correct
	            if (userGuess < numberToGuess) {
	                System.out.println("Too low! Try again.");
	            } else if (userGuess > numberToGuess) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Congratulations! You've guessed the number!");
	                System.out.println("It took you " + numberOfTries + " tries.");
	            }
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}

	


