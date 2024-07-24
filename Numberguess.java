//Que 4: Repeat steps 2 and 3 until the user guesses the correct number.You can incorporate additional details as follows

package com;

import java.util.Random;
import java.util.Scanner;

public class Numberguess {
	public static void main(String []args)
	{
		
		int minNum=1;
		int maxNum=100;
		
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		
		int randomNum=random.nextInt(maxNum - minNum +1)+minNum;
		
		int UserGuess;
		int attempts=0;
		
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("Guess a number between " + minNum + " and " + maxNum);
		
		do
		{
			System.out.println("Enter Your Guess=");
			
			UserGuess=sc.nextInt();
			attempts++;
			
			if(UserGuess < randomNum)
			{
				System.out.println("To Low.  Try Again");
			}
			else if (UserGuess > randomNum) 
			{
				
				System.out.println("To high.  Try Again");
			}
			else
			{
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");

			}
			
			
		}
		while(UserGuess != randomNum);
		
		sc.close();
		
		
		
	}

}