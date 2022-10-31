package com.objectcreattesting2.practiceprogram;

class Country
{
	String firstname;
	int pincode;
	Country()
	{
		firstname="India";
		pincode=560040;
		System.out.println("first name:"+firstname);
		System.out.println("ID:"+pincode);
		System.out.println("_ _ _ _ _ _ _ _ _ ");

	}


}
class State
{
	String firstname;
	int pincode;
	State()
	{
		firstname="karnatka";
		pincode=560033;
		System.out.println("firstName:"+firstname);
		System.out.println("ID:"+pincode);
		System.out.println("_ _ _ _ _ _ _ _ ");

	}

}
class District
{
	String firstname;
	int pincode;
	District()
	{
		firstname="banglore";
		pincode=560042;
		System.out.println("firstname:"+firstname);
		System.out.println("ID:"+pincode);
		System.out.println("_ _ _ _ _ _ _ _ ");

	}
}
class Village
{
	String firstname;
	int pincode;
	Village()
	{
		firstname="Nammuru";
		pincode=524126;
		System.out.println("firstname:"+firstname);
		System.out.println("ID:"+pincode);
		System.out.println("_ _ _ _ _ _ _ _ ");

	}
}


public class ASSIGNMENT6

{
	public static void main(String args[])
	{
		Country India=new Country();


		State kar=new State();

		District DST=new District();

		Village VLG=new Village();

	}
}



























