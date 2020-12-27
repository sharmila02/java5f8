/*****************************************************
java program to create a class automobile with cars trucks vans as children,
complete with parameter constructors which pass the parent member variables to
 a child class
****************************************/

/*************************************************************************
Lab Session Number	: 04
Type of Lab		: In Lab
Problem No.		: 01
Author			: Kavya Sharmila Siram	
Date			: 23/12/2020
Program Name		: TestInheritance.java
Topics covered		: variables, datatypes, operators, control statements
			  classes, objects, constructors, inheritance and its types
			  this and super keywords, method overriding
****************************************************************/

//import required packages
import java.util.Scanner;
import java.lang.*;


class AutoMobile
{
	// Add variables(properties of object)
	String make;
	String yearModel;

	// Add no argument constructor
	public AutoMobile()
	{
		make = "Unknown";
		yearModel = "Unknown";

	}

	// Add Parameterised Constructor
	public AutoMobile(String make,String yearModel)
	{
		this.make = make;
		this.yearModel = yearModel;
	}

	public void display()
	{
		System.out.println("Make = " + make);
		System.out.println("Year/Model = " + yearModel);
	}


}

//define a sub class Vehicle that inherits the super class AutoMobile
class Vehicle extends AutoMobile
{
	// Added variables
	String plateNumber;
	int numOfWheels;
	int fuel;
	int speed;
	static int maxspeed = 100;
	
	// Add no argument constructor
	public Vehicle()
	{
		plateNumber = "Unknown";
		numOfWheels = 0;
		fuel = 0;
		speed = 0;
	}

	// Add parameterized constructor
	public Vehicle(String make, String yearModel, String plateNumber,int numOfWheels, int fuel, int speed)
	{
		super(make, yearModel);
		this.plateNumber = plateNumber;
		this.numOfWheels = numOfWheels;
		this.fuel = fuel;
		this.speed = speed;
	
	}

	public void display()
	{
		super.display();
		System.out.println("Plate number is " + plateNumber);
		System.out.println("It has " + numOfWheels + " wheels");
		System.out.println("It's fuel capacity is " + fuel);
		System.out.println("It has speed " + speed + "Km/hr");
	}
		
	

	
	
		

}


class Car
{



}

public class TestInheritance
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the make of the car:");
		String make = sc.nextLine();
		System.out.println("Enter the year and model of the car:");
		String yearModel = sc.nextLine();
		AutoMobile a1 = new AutoMobile(make, yearModel);
		a1.display();
		
	}
}