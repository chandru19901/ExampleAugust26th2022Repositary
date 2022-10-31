package com.inheritance.practice;


class Maths111
{
	void addition(int x,int y)
	{
		System.out.println("Additifon result:"+(x+y));
	}
}
class Maths121 extends Maths111
{
	void Sub(int x,int y)
	{
		System.out.println("Sub result:"+(x-y));
	}
}
class Maths131 extends Maths121
{
	void Muilt(int x,int y)
	{
		System.out.println("Muilt Result:"+(x*y));
	}
}
class Maths14 extends Maths111
{
	void division(int x,int y)
	{
		System.out.println("division result:"+(x/y));
	}
}


public class Assign3 {

	public static void main(String[] args) {

		Maths131 obj=new Maths131();

		obj.addition(1,2);
		obj.Sub(50,40);
		obj.Muilt(3,6);

		Maths14 OBJ=new Maths14();


		OBJ.division(25,5);

		OBJ.addition(20, 23);

	}

}
