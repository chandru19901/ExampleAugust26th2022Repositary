package com.createobjectorinstancetesting.practiceprogram;

class Animal
{
	String firstName;
	int amount;
	String color;
	String location;


}
class Fruits
{
	String firstName;
	int amount;
	String color;
	String location;

}
class Vegitables
{
	String firstName;
	int amount;
	String color;
	String location;

}
class Flowers
{
	String firstName;
	int amount;
	String color;
	String location;
}


public class ASSIGNMENT4

{
	public static void main(String args[])
	{
		Animal Dog=new Animal();
		Dog.firstName="Dog";
		Dog.amount=2500;
		Dog.color="Black";
		Dog.location="Mumbai";
		System.out.println("first name:"+Dog.firstName);
		System.out.println("price:"+Dog.amount);
		System.out.println("color:"+Dog.color);
		System.out.println("location:"+Dog.location);

		Fruits Mango=new Fruits();
		Mango.firstName="Mango";
		Mango.amount=300;
		Mango.color="yellow";
		Mango.location="raichur";
		System.out.println("firstName:"+Mango.firstName);
		System.out.println("price:"+Mango.amount);
		System.out.println("color:"+Mango.color);
		System.out.println("location:"+Mango.location);

		Vegitables Potato1=new Vegitables();
		Potato1.firstName="Potato";
		Potato1.amount=3000;
		Potato1.color="Grey";
		Potato1.location="manvi";
		System.out.println("firstname:"+Potato1.firstName);
		System.out.println("price:"+Potato1.amount);
		System.out.println("color:"+Potato1.color);
		System.out.println("location:"+Potato1.location);

		Flowers Lotus=new Flowers();
		Lotus.firstName="Lotus";
		Lotus.amount=250;
		Lotus.color="pink";
		Lotus.location="delhi";
		System.out.println("firstname:"+Lotus.firstName);
		System.out.println("price:"+Lotus.amount);
		System.out.println("color:"+Lotus.color);
		System.out.println("location:"+Lotus.location);


	}
}














