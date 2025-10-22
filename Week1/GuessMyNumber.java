package Week1;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("^^^^^^^^");
        System.out.println("Velkommen til 'Guess MY Number' ");
        System.out.print("Tænk på et tal mellem 1 og 100, og skriv det her: ");

        int secret = scanner.nextInt();
        scanner.nextLine(); // rydder linjen

        if (secret < 1 || secret > 100) {
            System.out.println("Tallet skal være mellem 1 og 100!");
            return;
        }

        System.out.println("\nOkay, jeg prøver at gætte dit tal...");

        int guess;
        int tries = 0;

        do {
            guess = random.nextInt(100) + 1; // 1-100
            tries++;
            System.out.println("Mit gæt #" + tries + ": " + guess);

            if (guess < secret) {
                System.out.println("For lavt!");
            } else if (guess > secret) {
                System.out.println("For højt!");
            } else {
                System.out.println(" Jeg gættede det! Dit tal var " + secret + "!");
                System.out.println("Jeg brugte " + tries + " forsøg.");
            }

        } while (guess != secret);

        System.out.println("Tak for spillet ");
        scanner.close();
    }
}