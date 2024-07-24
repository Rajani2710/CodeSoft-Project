
//Que 3 : Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low

package com;

import java.util.Random;
import java.util.Scanner;

public class Compareguessnumber {
    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 100;

        Random random = new Random();
        int randomNumber = random.nextInt(maxNum - minNum + 1) + minNum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the number between " + minNum + " and " + maxNum + ":");

        int userGuess = sc.nextInt();

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess is correct.");
        } else if (userGuess < minNum || userGuess > maxNum) {
            System.out.println("Please enter a number within the specified range.");
        } else if (userGuess < randomNumber) {
            System.out.println("Too low. Try again!");
        } else {
            System.out.println("Too high. Try again!");
        }

        sc.close();
    }
}
