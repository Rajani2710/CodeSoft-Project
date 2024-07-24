//Question1  : Generate a random number within a specified range, such as 1 to 100.

package com;

import java.util.Random;

public class Randomnumber {
	
	public static void main(String[] args)
	{
		int minRange=1;
		int maxRange=100;
		
		Random random=new Random ();
		
		int randomNumber= random.nextInt(maxRange-minRange+1)+minRange;
		
		System.out.println("RandomNumber : " +randomNumber);
	}

}
