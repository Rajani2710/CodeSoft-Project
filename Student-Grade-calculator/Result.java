/*
 Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user
 */


package com;

import java.util.Scanner;

public class Result {
	
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks obtained in each subject (out of 100):");
		
		int numOfSubjects = 5;
        String[] subjectNames = {"Math", "English", "Science", "Marathi", "Social Science"};
        int[] subjectMarks = new int[numOfSubjects];

        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print(subjectNames[i] + ": ");
            subjectMarks[i] = sc.nextInt();
        }

		int totalMarks=0;
		for(int marks : subjectMarks)
		{
			totalMarks +=marks;
			
		}
		
		double Percentage = (double) totalMarks / numOfSubjects ;
		
		
		char grade;
		
		if(Percentage >=90)
		{
			grade ='A';
		}
		else if(Percentage >= 80)
		{
			grade ='B';
		}
		else if(Percentage >=60)
		{
			grade = 'c';
		}
		else if(Percentage >=55)
		{
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("/nResults:");
		
		for (int i=0; i<numOfSubjects ;i++)
		{
            System.out.println(subjectNames[i] + ": " + subjectMarks[i]);

		}
		
		System.out.println("Total Marks : " +totalMarks);
		
		System.out.println("Percentage : "+Percentage +"%");
		
		System.out.println("Grade : "+grade);
		
		sc.close();
	}

}
