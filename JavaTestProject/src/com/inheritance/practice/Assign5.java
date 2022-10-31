package com.inheritance.practice;

//.Constructor overloading

class EmployeeDetails1
{
	EmployeeDetails1(String En,String Des,int Eid)
	{
		System.out.println("EmployeeName:"+ En);
		System.out.println("Desgination:"+Des);
		System.out.println("EmpID:"+ Eid);
	}
	EmployeeDetails1(String Sal)
	{
		System.out.println("Salary:"+Sal);
	}
}
class EmpInfor extends EmployeeDetails1
{
	EmpInfor(String En,String Des,int Eid)
	{
		super(En,Des,Eid);
	}
	EmpInfor(String Sal)
	{
		super(Sal);
	} 
}
class po extends EmpInfor
{
	po(String En,String Des,int Eid)
	{
		super(En,Des,Eid);
	}
	po(String Sal)
	{
		super(Sal);
	}
}


public class Assign5 {

	public static void main(String[] args) {

		EmpInfor obj=new EmpInfor("Alex","QA",210);

		EmpInfor obj1=new EmpInfor("$2100");

		System.out.println("--------------------------");

		po o=new po("king","Devolper",322);

		po o1=new po("$3000");

	}

}
