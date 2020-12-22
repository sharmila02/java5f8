//How to take input from user through keyboard


/****************************
Case Study	:5
Programmer	:Sharmila
Date		:20/10/2020
Program Name	:UserInputDemo.java
Concepts	:Using Scanner class to take integer input 
*****************************/



import java.util.Scanner;

public class UserInputDemo
{
	public static void main(String...args)
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = console.nextLine();

		System.out.println("Hello, What is your Age?");
		int age = console.nextInt();
		int retirement = 60 - age;

		System.out.println("Hello " + name + ", you have " + retirement + " " + "years to retire");


	}
}