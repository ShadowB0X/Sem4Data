package Week1;
import java.util.Scanner;

public class GuessTheNumber {

    public static int getRandom() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        System.out.println("^^");
        System.out.println("Welcome to 'Guess the Number'!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        Scanner scanner = new Scanner(System.in);
        int number = getRandom();
        int guess;

        do {

            guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("Too low! Try again.");
            }
            if (guess > number) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != number);
        System.out.println("Congratulations! You've guessed the number.");

        System.out.println("Congratulations! You've guessed the number.");
    }

}
