import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object for generating random numbers
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean hasGuessedCorrectly = false;
        
        // Welcome message
        System.out.println("Welcome to the Guess Number Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        
        // Loop until the player guesses the correct number or runs out of tries
        while (numberOfTries < 3 && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess < 1 || guess > 100) {
                System.out.println("Please guess a number between 1 and 100.");
                numberOfTries--; // Do not count invalid guesses
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It took you " + numberOfTries + " tries.");
            }
        }
        
        // If the player did not guess the number in 3 tries
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've used all your tries. The correct number was " + numberToGuess + ".");
        }
        
        // Close the scanner
        scanner.close();
    }
}
