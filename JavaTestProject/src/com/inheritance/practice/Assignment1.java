package com.inheritance.practice;

class Maths1
{
	void addition(int x,int y)
	{
		System.out.println("Additifon result:"+(x+y));
	}
}
class Maths2 extends Maths1
{
	void Sub(int x,int y)  
	{
		System.out.println("Sub result:"+(x-y));
	}
}
class Maths3 extends Maths1
{
	void Muilt(int x,int y)
	{
		System.out.println("Result:"+(x*y));
	}
}


public class Assignment1 {

	public static void main(String[] args) {

		Maths2 obj=new Maths2();

		obj.Sub(10,20);
		obj.addition(20,20);

		Maths3 obj1=new Maths3();

		obj1.Muilt(12,9);
		obj.addition(29,20);

	}

}
