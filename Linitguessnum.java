//Que : 5. Limit the number of attempts the user has to guess the number.


package com;

import java.util.Random;
import java.util.Scanner;

public class limitguessnum {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		int MinNum=1, MaxNum=50;
		
		Random random=new Random();
		
		int randomNumber=random.nextInt( MaxNum -  MinNum +1)+ MinNum;
		
		int maxAttempts = 5; // Set the maximum number of attempts
        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + MinNum + " and " + MaxNum);
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break; // Exit the loop if the correct number is guessed
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + randomNumber);
        }

        sc.close();
	}
}