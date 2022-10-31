package com.objectcreattesting2.practiceprogram;

class Student
{
	String firstName;
	int ID;
	String Branch;
	String location;
	Student()
	{
		firstName="Chandru";
		ID=1118118;
		Branch="bsc";
		location="devadurga";
		System.out.println("firstName:"+firstName);
		System.out.println("ID:"+ID);
		System.out.println("Branch:"+Branch);
		System.out.println("location:"+location);

	}


}
class University
{
	String firstName;
	int ID;
	String Branch;
	String location;
	University()
	{
		firstName="Gnanagangotri";
		ID=594101;
		Branch="Chemistry";
		location="kalburgi";
		System.out.println("firstName:"+firstName);
		System.out.println("ID:"+ID);
		System.out.println("Branch:"+Branch);
		System.out.println("location:"+location);

	}
}
class Library
{
	String firstName;
	int ID;
	String Branch;
	String location;
	Library()
	{

		firstName="srk";
		ID=1474809;
		Branch="msc";
		location="Banglore";
		System.out.println("firstName:"+firstName);
		System.out.println("ID:"+ID);
		System.out.println("Branch:"+Branch);
		System.out.println("location:"+location);

	}


}
class College
{

	String firstName;
	int ID;
	String Branch;
	String location;
	College()
	{
		firstName="srps";
		ID=027;
		Branch="science";
		location="Raichur";
		System.out.println("firstName:"+firstName);
		System.out.println("ID:"+ID);
		System.out.println("Branch:"+Branch);
		System.out.println("location:"+location);

	}

}


public class ASSIGNMENT5

{
	public static void main(String args[])
	{
		Student Chandru=new Student();


		University Gulbarga =new University();


		Library srk=new Library();



		College Lvd=new College();

	}
}





















