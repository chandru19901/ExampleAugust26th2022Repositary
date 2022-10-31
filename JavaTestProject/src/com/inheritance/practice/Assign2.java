package com.inheritance.practice;

//.Multilevel inheritance

class Maths11
{
	void addition(int x,int y)
	{
		System.out.println("Additifon result:"+(x+y));
	}
}
class Maths12 extends Maths11
{
	void Sub(int x,int y)
	{
		System.out.println("Sub result:"+(x-y));
	}
}
class Maths13 extends Maths12
{
	void Muilt(int x,int y)
	{
		System.out.println("Result:"+(x*y));
	}
}


public class Assign2 {

	public static void main(String[] args) {

		Maths13 obj=new Maths13();

		obj.Sub(10,20);
		obj.addition(20,20);
		obj.Muilt(50,5);

	}

}
