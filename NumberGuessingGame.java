import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfRounds = 0;
        int totalScore = 0;

        while (true) {
            numberOfRounds++;
            int randomNumber = random.nextInt(100) + 1;
            int userScore = 0;

            while (true) {
                System.out.println("Round " + numberOfRounds);
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Invalid guess. Please enter a number between 1 and 100.");
                } else {
                    userScore++;

                    if (userGuess == randomNumber) {
                        System.out.println("Congratulations! You guessed the correct number.");
                        break;
                    } else if (userGuess < randomNumber) {
                        System.out.println("Too low. Try again.");
                    } else {
                        System.out.println("Too high. Try again.");
                    }
                }
            }

            totalScore += userScore;
            System.out.println("Your score after this round is: " + userScore);
            System.out.println("Do you want to play again? (yes/no)");
            String userChoice = scanner.next();

            if (!userChoice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing! Your total score is: " + totalScore);
    }
}