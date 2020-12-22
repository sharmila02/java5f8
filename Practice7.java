//java program to demonstarate a given problrm by implementing variables, data types and control statements

/*************************************************************************
Lab Session Number	:01
Type of Lab		:In Lab
Problem No.		:01
Author			:Kavya Sharmila Siram	
Date			:21/10/2020
Program Name		:Practice7.java
Topics covered		: Fundamentals of Java
			(Variables, Data types, operators, control statements)
****************************************************************/

//import required packages
import java.util.Scanner;
import java.lang.*;

class Meal
{
	//properties of meal object(Declaring Variables).
	String name;
	static double baseCost = 45;
	double tipPercentage;
	double taxPercentage;
	double tip;
	double tax;
	double totalCost;
	Scanner console = new Scanner(System.in);

	//adding methods to Meal class
	void read()
	{
		System.out.println("Enter Customer's Name");
		name = console.nextLine();

		System.out.println("Enter tip percentage");
		tip = console.nextDouble();

		System.out.println("Enter tax percentage");
		tax = console.nextDouble();
	
	}
	
	void calculateBill()
	{
		tip = baseCost * (tipPercentage / 100);
		tax = baseCost * (taxPercentage / 100);
		totalCost = tip + tax + baseCost;

	}

	void display()
	{
		System.out.println("Customer Name: " + name);
		System.out.println("Base cost: " + baseCost);
		System.out.println("Tip percentage: " + tipPercentage);
		System.out.println("Tax Percentage: " + taxPercentage);
		System.out.println("Tip cost: " + tip);
		System.out.println("Tax cost: " + tax);
		System.out.println("Total cost: " + totalCost);
	}
}

//driver class

public class Practice7
{
 	public static void main(String args[])
	{
		Meal m1 = new Meal();
		m1.read();
		m1.calculateBill();
		m1.display();
	}
}


