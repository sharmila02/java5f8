//java program to demonstarate a given problem

/*************************************************************************
Lab Session Number	:02
Type of Lab		:In Lab
Problem No.		:03
Author			:Kavya Sharmila Siram	
Date			:26/10/2020
Program Name		:Practice9.java
Topics covered		:Classes and Objects fundamentals
****************************************************************/
//importing required packages
import java.lang.*;
import java.util.Scanner;

class Customer
{
	String customerName;
	int customerNumber;
	double price, quantity,totalPrice, netPrice;
	double discount;
	Scanner console = new Scanner(System.in);
	
	
	void init()
	{
		customerName = "anon";
		customerNumber = 0;
		quantity = 0;
		discount = 0;
		price = 0;
		totalPrice = 0;
		netPrice = 0;
	}

	void input()
	{
		System.out.println("Enter customer name:");
		customerName = console.nextLine();
		System.out.println("Please enter the price:");
		price = console.nextDouble();
		System.out.println("Please enter the quantity:");
		quantity = console.nextInt();
		System.out.println("Please enter the Customer Number:");
		customerNumber = console.nextInt();
		
	}
	
	void calDiscount()
	{
		totalPrice = price * quantity;
		if (totalPrice >= 50000)
		{
			discount = 0.25 * totalPrice;
		}
		if (totalPrice >= 25000 && totalPrice < 50000)
		{
			discount = 0.15 * totalPrice;
		}
		if (totalPrice < 25000)
		{
			discount = 0.10 * totalPrice;
		}
		netPrice = totalPrice - discount;

	}

	void display()
	{
		System.out.println("Customer Number is: " + customerNumber);	
		System.out.println("Customer Name is: " + customerName);	
		System.out.println("Total price is: " + totalPrice);
		System.out.println("Discount is: " + discount);
		System.out.println("Net price is: " + netPrice);
		
	}

}

//driver class

public class Practice9
{
	public static void main(String...args)
	{
		Customer c1 = new Customer();
		c1.input();
		c1.calDiscount();
		c1.display();
	}


}

		
