
//Que 6. Add the option for multiple rounds, allowing the user to play again.

package com;

import java.util.Scanner;

public class RepeatnumGuess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            playGame(sc);

            System.out.print("Do you want to play again? (yes/no): ");
            String input = sc.next().toLowerCase();
            playAgain = input.equals("yes");
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }

    public static void playGame(Scanner sc) {
        int randomNumber = (int) (Math.random() * 15) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 15!");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it right in " + attempts + " attempts!");
            }
        } while (guess != randomNumber);

        // Consume the newline character left by nextInt()
        sc.nextLine();
    }
}
