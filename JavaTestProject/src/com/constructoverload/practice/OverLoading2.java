package com.constructoverload.practice;

class Library
{

	
      Library(String Libname)
	{
		System.out.println("LibraryName:"+Libname);
	}
	Library(int stdid)
	{
		System.out.println("Student id:"+stdid);
	}
	Library(String book,int price)
	{
		System.out.println("book:"+book);
		System.out.println("price:"+price);
	}

}


public class OverLoading2
{


	public static void main(String args[])
	{

		Library a=new Library("raju");

		Library b=new Library(45);

		Library c=new Library("corejava",2400);
	}
}









