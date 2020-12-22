//to calculate area of rectangle with 2*3 dimensions

/****************************
Case Study	:3
Programmer	:Sharmila
Date		:16/10/2020
Program Name	:Rectangle.java
Concepts	:defining variables of different data types 
*****************************/


import java.lang.*;

class Rectangle
{
	int length;
	int breadth;
	double area;
	void calculateArea()
	{
		area = length * breadth;
	}
	
	void display()
	{
		System.out.println("Area of the rectangle is: " + area);

	}
}


public class Area
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();

		r1.length = 2;
		r1.breadth = 3;
		r1.calculateArea();
		r1.display();
		
	}
}