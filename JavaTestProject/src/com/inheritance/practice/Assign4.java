package com.inheritance.practice;

//4.wap MLI in which super class consisting parameterized constructor

class EmployeeDetails
{
	EmployeeDetails(String En,String Des,int Eid)
	{
		System.out.println("EmployeeName:"+ En);
		System.out.println("Desgination:"+Des);
		System.out.println("EmpID:"+ Eid);
	}
}
class Employee extends EmployeeDetails
{
	Employee() 
	{
		super("john", "QA", 210);
	}
}


public class Assign4 {

	public static void main(String[] args) {

		Employee obj=new Employee();

	}

}
