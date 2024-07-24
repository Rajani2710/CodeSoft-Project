//	Que 2 : Prompt the user to enter their guess for the generated number. 

package com;

import java.util.Random;
import java.util.Scanner;

public class Guessthenumber {
    public static void main(String[] args) {
        int minNum = 1, maxNum = 10;

        Random random = new Random();
        int randomNumber = random.nextInt(maxNum - minNum + 1) + minNum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the number between " + minNum + " and " + maxNum + ":");
        
        // Prompt user to enter their guess
        System.out.print("Enter your guess: ");
        int userGuess = sc.nextInt();

        // Compare the user's guess with the generated number
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess is correct.");
        } else {
            System.out.println("Sorry, the correct number was: " + randomNumber);
        }

        sc.close();
    }
}
