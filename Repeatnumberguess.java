
//Que 6. Add the option for multiple rounds, allowing the user to play again.

package com;

import java.util.Scanner;

public class Repeatnumguess {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        boolean playAgain = true;

	        while (playAgain) {
	            if (playGame(sc)) {
	                
	                String input = sc.nextLine().toLowerCase();
	                playAgain = input.equals("yes");
	            } else {
	                playAgain = false;
	            }
	        }

	        System.out.println("Thanks for playing!");
	        sc.close();
	    }

	    public static boolean playGame(Scanner sc) {
	        
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
	                return true;
	            }
	        } while (guess != randomNumber);

	        sc.nextLine();
	        return false; 
	    }
	}