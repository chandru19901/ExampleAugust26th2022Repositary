package com.inheritance.practice;

//hybrid inheritance consisting the overloading consturtor

class Details
{
	Details(String Name,int Age)
	{
		System.out.println("Name:"+Name);
		System.out.println("Age:"+Age);
	}
	Details(String Location)
	{
		System.out.println("Location:"+Location);
	}
}
class Person extends Details
{
	Person(String Name,int Age)
	{
		super(Name,Age);
	}
	Person(String Location)
	{
		super(Location);
	}
}
class Information extends Person
{
	Information(String Name,int Age)
	{
		super(Name,Age);
	}
	Information(String Location)
	{
		super(Location);
	}
}
class FullDetails extends Details
{

	FullDetails(String Name,int Age)
	{
		super(Name,Age);
	}
	FullDetails(String Location)
	{
		super(Location);
	}
}


public class Assign6 {

	public static void main(String[] args) {

		Information obj=new Information("Peter",25);
		Information obj1=new Information("New Jesrsy");

		System.out.println("--------------------");

		FullDetails obj11=new FullDetails("John",21);
		FullDetails obj12=new FullDetails("Texas");
	}

}

