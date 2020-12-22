//java program to demonstarate a given problem: guessing a number by implementing control statements

/*************************************************************************
Lab Session Number	:01
Type of Lab		:Post Lab
Problem No.		:01
Author			:Kavya Sharmila Siram	
Date			:22/10/2020
Program Name		:Practice8.java
Topics covered		:Fundamentals of Java
			(Variables,control statements, escape sequences)
****************************************************************/
//introduced Math class - rand method
//import the required packages

import java.util.Scanner;
import java.lang.*;


class GuessNumber
{
	//Adding method to determine the guess number with secret number
	public String determineGuess(int userNumber, int secretNumber, int count)
	{
		if(userNumber < 0 || userNumber > 100)
		{	
			return "Your guess is invalid";

		}
		else if(userNumber == secretNumber)
		{
			return "Correct! You won\nTotal Guesses: " + count;
		}
		else if(userNumber > secretNumber)
		{
			return "Your guess is too high, try again.\nTry Number: " + count;
		}
		else //(userNumber < secretNumber)
		{
			return "Your guess is too low, try again.\nTry Number: " + count;
		}
	}
}
	
		



//Driver Class

public class Practice8
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		int secretNumber = (int)(Math.random() * 100)+ 1;
		int userNumber = 0;
		GuessNumber gn = new GuessNumber();
		int count = 1;
		while(userNumber != secretNumber)
		{
			System.out.println("Enter a guess number between 1 and 100");
			userNumber = console.nextInt();
			String result = gn.determineGuess(userNumber, secretNumber, count);
			System.out.println(result);
			count++;
		}
	}
}
