
//Que 7. Display the user's score, which can be based on the number of attempts taken or rounds won.

package com;

import java.util.Scanner;

public class Gamewon {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRounds = 0;
        int roundsWon = 0;

        boolean playAgain = true;

        while (playAgain) {
            totalRounds++;
            if (playGame(sc)) {
                roundsWon++;
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String input = sc.nextLine().toLowerCase();
            playAgain = input.equals("yes");
        }

        System.out.println("Thanks for playing!");
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Your score: " + roundsWon + "/" + totalRounds);
        sc.close();
    }

    public static boolean playGame(Scanner scanner) {
        
        int randomNumber = (int) (Math.random() * 25) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 25!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it right in " + attempts + " attempts!");
                scanner.nextLine(); 
                return true;
            }
        } while (guess != randomNumber);

        scanner.nextLine(); 
        return false; 
    }
}