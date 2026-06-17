import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High!");
            }
            else if (guess < secretNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Congratulations!");
                System.out.println("You guessed the number in "
                                   + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
