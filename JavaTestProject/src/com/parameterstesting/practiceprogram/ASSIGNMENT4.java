package com.parameterstesting.practiceprogram;

class Animal
{
	String firstName;
	int amount;
	String color;
	String location;
	Animal(String fn,int at,String cr,String ln)
	{
		firstName=fn;
		amount=at;
		color=cr;
		location=ln;
		System.out.println("firstname:"+firstName);
		System.out.println("price:"+amount);
		System.out.println("color:"+color);
		System.out.println("location:"+location);

	}

}
class Fruits
{
	String firstName;
	int amount;
	String color;
	String location;
	Fruits(String fn,int at,String cr,String lc)
	{
		firstName=fn;
		amount=at;
		color=cr;
		location=lc;
		System.out.println("firstName:"+firstName);
		System.out.println("price:"+amount);
		System.out.println("color:"+color);
		System.out.println("location:"+location);

	}
}
class Vegitables
{
	String firstName;
	int amount;
	String color;
	String location;
	Vegitables(String fn,int at,String cr,String lc)
	{
		firstName=fn;
		amount=at;
		color=cr;
		location=lc;
		System.out.println("firstname:"+firstName);
		System.out.println("price:"+amount);
		System.out.println("color:"+color);
		System.out.println("location:"+location); 
	}
}
class Flowers
{
	String firstName;
	int amount;
	String color;
	String location;
	Flowers(String fn,int at,String cr,String lc)
	{

		firstName=fn;
		amount=at;
		color=cr;
		location=lc;
		System.out.println("firstname:"+firstName);
		System.out.println("price:"+amount);
		System.out.println("color:"+color);
		System.out.println("location:"+location);	
	}

}


public class ASSIGNMENT4

{
	public static void main(String args[])
	{
		Animal Dog=new Animal("dog",2500,"black","mumbai");
		Animal Dpg1=new Animal("panda",15000,"white","srinagar");

		Fruits Mango=new Fruits("mango",300,"yellow","raichur");
		Fruits mango1=new Fruits("grapes",500,"voilet","indi");

		Vegitables Potato=new Vegitables("potato",3000,"grey","manvi");
		Vegitables Potato1=new Vegitables("beatroot",4000,"brown","gadag");

		Flowers Lotus=new Flowers("lotus",250,"pink","delhi");
		Flowers Lotus1=new Flowers("rose",300,"red","jaipur");
		;
	}
}














