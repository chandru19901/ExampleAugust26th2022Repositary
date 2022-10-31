package com.constructoverload.practice;



class Laptop
{
	Laptop (String Lapname)
	{
		System.out.println("Laptop Name:"+Lapname);
	}
	Laptop(int Lapprice)
	{
		System.out.println("Lapprice:"+Lapprice);
	}
	Laptop(String Company,int ramgb)
	{
		System.out.println("Company:"+Company);
		System.out.println("ramgb:"+ramgb);
	}
}

public class OverLoading1
{
	public static void main(String args[])
	{
		Laptop bcc=new Laptop("dell");
		Laptop bdd=new Laptop(9000);
		Laptop bss=new Laptop("storage",12);
	}
}


