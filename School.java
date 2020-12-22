//A Program to use variable data types and display characterstics of a school

/****************************
Case Study	:2
Programmer	:Sharmila
Date		:15/10/2020
Program Name	:Practice4.java
Concepts	:defining variables of different data types 
*****************************/


import java.lang.*;




public class School
{
	String name;
	byte classes;
	int strength;
	float fees;
	double land_cost;
	boolean is_govt_recognised;
	
	
	void display()
	{
	System.out.println("Name of School is " + name);
	System.out.println("Classes in school are " + classes);
	System.out.println("Strength of School is " + strength);
	System.out.println("Fees per annum is " + fees);
	System.out.println("Cost of land is: " + land_cost);
	System.out.println("Is the school recognised by govt.: " + is_govt_recognised);

	}
}


class SchoolDriver
{
	public static void main(String args[])
	{
	School abc = new School();
	abc.name = "abc";	
	abc.classes = 10;
	abc.strength = 654386;
	abc.fees = 45000.0f;
	abc.land_cost = 6746885868.00;
	abc.is_govt_recognised = true;
	abc.display();
	}
}


