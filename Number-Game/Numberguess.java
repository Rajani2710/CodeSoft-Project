//Que 4: Repeat steps 2 and 3 until the user guesses the correct number.You can incorporate additional details as follows

package com;

import java.util.Random;
import java.util.Scanner;

public class Numberguess {
    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 100;

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNum = random.nextInt(maxNum - minNum + 1) + minNum;
        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + minNum + " and " + maxNum);

        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < randomNum) {
                System.out.println("Too low. Try again.");
            } else if (userGuess > randomNum) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            }
        } while (userGuess != randomNum);

        sc.close();
    }
}
