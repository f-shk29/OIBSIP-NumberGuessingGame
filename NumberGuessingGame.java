import java.util.*;

public class NumberGuessingGame {
    public static void main(String CP[]) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char playAgain;
        do {
            int randomNum = r.nextInt(100) + 1; // number between 1 to 100
            int attempts = 0;
            int guess = 0;
            int maxAttempts = 07;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess a number between 1 to 100. You have " + maxAttempts + " attempts.");

            while (guess != randomNum && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == randomNum) {
                    System.out.println("Congrats! You guessed the number in " + attempts + " attempts!");
                    break;
                } else if (guess < randomNum) {
                    System.out.println("Your guess is too low! Try again.");
                } else {
                    System.out.println("Your guess is too high! Try again.");
                }
            }

            if (attempts >= maxAttempts && guess != randomNum) {
                System.out.println("No more Attempts left!");
                System.out.println("The correct number was: " + randomNum);
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');

        sc.close();
        System.out.println("Thanks for playing!");
    }
}