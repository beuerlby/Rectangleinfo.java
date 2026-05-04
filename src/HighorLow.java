import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        // Declare variables
        int randomNumber = generator.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean done = false;

        // Get valid guess
        do {
            System.out.print("Guess a number from 1 to 10: ");

            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();

                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Your guess must be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("You must enter a valid integer.");
            }
        } while (!done);

        // Output random number
        System.out.println("The random number was: " + randomNumber);

        // Compare guess to random number
        if (guess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else if (guess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else {
            System.out.println("Your guess was on the money!");
        }
    }
}
