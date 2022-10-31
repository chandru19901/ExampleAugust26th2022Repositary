package com.parameterstesting.practiceprogram;

class Employee
{
	String firstName;
	int age;
	int salary;
	String company;
	Employee(String fn,int ag, int sal,String cmp)
	{
		firstName=fn;
		age=ag;
		salary=sal;
		company=cmp;
		System.out.println("firstName:"+firstName);
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
		System.out.println("company:"+company);

	}


}
class Department
{
	String DeptName;
	int DeptID;
	double timing;
	String Location;
	Department(String dn,int di,double tg,String ln)
	{
		DeptName=dn;
		DeptID=di;
		timing=tg;
		Location=ln;
		System.out.println("DeptName:"+DeptName);
		System.out.println("DeptID:"+DeptID);
		System.out.println("timing:"+timing);
		System.out.println("Location:"+Location);

	}
}
class Insurance
{
	String CompanyName;
	int id;
	int amount;
	String compname; 
	Insurance(String cn,int i,int at,String cmp)
	{
		CompanyName=cn;
		id=i;
		amount=at;
		compname=cmp;

		System.out.println("compname:"+compname);
		System.out.println("id:"+id);
		System.out.println("amount:"+amount);
		System.out.println("compname:"+compname);
	}
}

public class ASSIGNMENT11
{
	public static void main(String args[])
	{
		Employee ram=new Employee("ram",25,25000,"Gowri");
		Employee ram1=new Employee("raju",45,34000,"delta");



				Department PWD=new Department("Public Work Department",2022,9.00,"Raichur");
		        Department PWD1=new Department(" esha construction ",2023,8.00,"Koppal");


		Insurance LIC=new Insurance("Life insurance company",2000,500000,"health insurance");
		Insurance LIC1=new Insurance("Bajaj insurance",2005,600000,"vehicle insurance");


	}
}

