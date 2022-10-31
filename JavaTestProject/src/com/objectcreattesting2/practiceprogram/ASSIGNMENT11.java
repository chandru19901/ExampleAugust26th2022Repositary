package com.objectcreattesting2.practiceprogram;

class Employee
{
	String firstName;
	int age;
	int salary;
	String company;
	Employee()
	{
		firstName="ramlal";
		age=25;
		salary=25000;
		company="Gowri";
		System.out.println("first name:"+firstName);
		System.out.println("age:"+age);
		System.out.println("sal:"+salary);
		System.out.println("comp:"+company);
		System.out.println("_ _ _ _ _ _ _ _");
	}


}
class Department
{
	String DeptName;
	int DeptID;
	double timing;
	String Location;
	Department()
	{
		DeptName="Public Work Department";
		DeptID=2022;
		timing=9.00;
		Location="Raichur";
		System.out.println("DeptName:"+DeptName);
		System.out.println("Dept.ID:"+DeptID);
		System.out.println("timing:"+timing);
		System.out.println("Location:"+Location);
		System.out.println("_ _ _ _ _ _ _ _");
	}
}
class Insurance
{
	String CompanyName;
	int id;
	int amount;
	String name;
	String compname; 
	Insurance()
	{
		compname="Life Insurane company";
		id=2000;
		name="Health Insurance;";
		System.out.println("compname:"+compname);
		System.out.println("id:"+id);
		System.out.println("amou:"+amount);
		System.out.println("name:"+name);
	}
}

public class ASSIGNMENT11
{
	public static void main(String args[])
	{
		Employee ram=new Employee();



		Department PWD=new Department();



		Insurance LIC=new Insurance();


	}
}

