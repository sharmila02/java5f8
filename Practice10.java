//chaining the constructors and overloading

/****************************
Lab Session Number	:03
Type of Lab		:In Lab
Problem No.		:01
Author			:Kavya Sharmila Siram	
Date			:03/11/2020
Program Name		:Practice10.java
Topics covered		:Constructors
*****************************/

class Employee
{
	String ename;
	int eid;
	//no argument constructor
	Employee()	
	{
		System.out.println("I am in no argument constructor");
	}

	//parameterised constructor
	Employee(String name)
	{
		this();
		ename = name;
	}

	Employee(String name, int id)
	{
		this(name);
		eid = id;
	}
	
	void display()
	{
		System.out.println("Employee name is " + ename);
		System.out.println("Employee id is " + eid);
	}
}

public class Practice10
{
	public static void main(String args[])
	{
		Employee e1 = new Employee("tasha", 109);
		Employee e2 = new Employee("nila", 578);
		e1.display();
		e2.display();


	}
}