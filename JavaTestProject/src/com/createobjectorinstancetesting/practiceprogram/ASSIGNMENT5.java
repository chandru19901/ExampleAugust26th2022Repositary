 package com.createobjectorinstancetesting.practiceprogram;

class Student
{
	String firstName;
	int ID;
	String Branch;
	String location;


}
class University
{
	String firstName;
	int ID;
	String Branch;
	String location;

}
class Library
{
	String firstName;
	int ID;
	String Branch;
	String location;


}
class College
{

	String firstName;
	int ID;
	String Branch;
	String location;

}


public class ASSIGNMENT5

{
	public static void main(String args[])
	{
		Student Chandru=new Student();
		Chandru.firstName="Chandru";
		Chandru.ID=1118118;
		Chandru.Branch="bsc";
		Chandru.location="devadurga";
		System.out.println("firstName:"+Chandru.firstName);
		System.out.println("ID:"+Chandru.ID);
		System.out.println("Branch:"+Chandru.Branch);

		System.out.println("location:"+Chandru.location);

		University Gulbarga =new University();
		Gulbarga.firstName="Gnanagangotri";
		Gulbarga.ID=594101;
		Gulbarga.Branch="Chemistry";
		Gulbarga.location="kalburgi";
		System.out.println("firstName:"+Gulbarga.firstName);
		System.out.println("ID:"+Gulbarga.ID);
		System.out.println("Branch:"+Gulbarga.Branch);
		System.out.println("location:"+Gulbarga.location);

		Library srk=new Library();
		srk.firstName="srk";
		srk.ID=1474809;
		srk.Branch="msc";
		srk.location="Banglore";
		System.out.println("firstName:"+srk.firstName);
		System.out.println("ID:"+srk.ID);
		System.out.println("Branch:"+srk.Branch);
		System.out.println("location:"+srk.location);

		College Lvd=new College();
		Lvd.firstName="srps";
		Lvd.ID=027;
		Lvd.Branch="science";
		Lvd.location="Raichur";
		System.out.println("firstName:"+Lvd.firstName);
		System.out.println("ID:"+Lvd.ID);
		System.out.println("Branch:"+Lvd.Branch);
		System.out.println("location:"+Lvd.location);

	}
}





















