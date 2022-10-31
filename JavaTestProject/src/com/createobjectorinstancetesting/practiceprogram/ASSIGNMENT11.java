package com.createobjectorinstancetesting.practiceprogram;

class Employee
{
	String firstName;
	int age;
	int salary;
	String company;


}
class Department
{
	String DeptName;
	int DeptID;
	double timing;
	String Location;

}
class Insurance
{
	String CompanyName;
	int id;
	int amount;
	String name;
	public String compname; 
}

	public class ASSIGNMENT11
	{
		public static void main(String args[])
		{
			Employee ram=new Employee();
			ram.firstName="ramlal";
			ram.age=25;
			ram.salary=25000;
			ram.company="Gowri";
			System.out.println("first name:"+ram.firstName);
			System.out.println("age:"+ram.age);
			System.out.println("sal:"+ram.salary);
			System.out.println("comp:"+ram.company);
			System.out.println("_ _ _ _ _ _ _ _");
			
			Department PWD=new Department();
			PWD.DeptName="Public Work Department";
			PWD.DeptID=2022;
			PWD.timing=9.00;
			PWD.Location="Raichur";
			System.out.println("DeptName:"+PWD.DeptName);
			System.out.println("Dept.ID:"+PWD.DeptID);
			System.out.println("timing:"+PWD.timing);
			System.out.println("Location:"+PWD.Location);
			System.out.println("_ _ _ _ _ _ _ _");
			 
			Insurance LIC=new Insurance();
			LIC.compname="Life Insurane company";
			LIC.id=2000;
			LIC.amount=5000000;
			LIC.name="Health Insurance;";
			System.out.println("compname:"+LIC.compname);
			System.out.println("id:"+LIC.id);
			System.out.println("amount:"+LIC.amount);
			System.out.println("name:"+LIC.name);
		}
	}

