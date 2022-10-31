package com.parameterstesting.practiceprogram;

class Student
{
	String firstName;
	int ID;
	String Branch;
	String location;
	Student(String fn,int i,String br,String lc)
	{
		firstName=fn;
		ID=i;
		Branch=br;
		location=lc;
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
	University(String fn,int i,String br,String lc)
	{
		firstName=fn;
		ID=i;
		Branch=br;
		location=lc;
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
	Library(String fn,int i,String br,String lc)
	{

		firstName=fn;
		ID=i;
		Branch=br;
		location=lc;
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
	College(String fn,int i,String br,String lc)
	{
		firstName=fn;
		ID=i;
		Branch=br;
		location=lc;
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
		Student Chandru=new Student("chandru",1118118,"bsc","devadurga");
		Student Chandru1=new Student("giri",1118113,"be","gadag");

		University Gulbarga =new University("gnanagangothri",594101,"chemistry","kalburgi");
		University Gulbarga1=new University("manasagangothri",564102,"physics","mysore");

		Library Srk=new Library("srk",1474809,"msc","banglore");
		Library Srk1=new Library("prk",148406,"mba","kitturu");


		College Lvd=new College("srps",027,"science","raichur");
		College Lvd1=new College("taranath",127,"arts","sindhanur");
	}
}





















