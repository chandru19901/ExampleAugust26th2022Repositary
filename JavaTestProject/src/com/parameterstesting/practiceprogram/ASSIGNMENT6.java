package com.parameterstesting.practiceprogram;

class Country
{
	String firstname;
	int pincode;
	Country(String fn,int pc)
	{
		firstname=fn;
		pincode=pc;
		System.out.println("first name:"+firstname);
		System.out.println("ID:"+pincode);
		System.out.println("_ _ _ _ _ _ _ _ _ ");

	}


}
class State
{
	String firstname;
	int pincode;
	State(String fn,int pc)
	{
		firstname=fn;
		pincode=pc;
		System.out.println("firstName:"+firstname);
		System.out.println("ID:"+pincode);
		System.out.println("_ _ _ _ _ _ _ _ ");

	}

}
class District
{
	String firstname;
	int pincode;
	District(String fn,int pc)
	{
		firstname=fn;
		pincode=pc;
		System.out.println("firstname:"+firstname);
		System.out.println("ID:"+pincode);
		System.out.println("_ _ _ _ _ _ _ _ ");

	}
}
class Village
{
	String firstname;
	int pincode;
	Village(String fn,int pc)
	{
		firstname=fn;
		pincode=pc;
		System.out.println("firstname:"+firstname);
		System.out.println("ID:"+pincode);
		System.out.println("_ _ _ _ _ _ _ _ ");

	}
}


public class ASSIGNMENT6

{
	public static void main(String args[])
	{
		Country India=new Country("india",560040);
		Country India1=new Country("japan",465123);


		State kar=new State("karnatka",560033);
		State Kar1=new State("telangana",450022);

		District DST=new District("banglore",560042);
		District DST1=new District("raichur",584101);

		Village VLG=new Village("nammuru",524126);
		Village VLG1=new Village("gajanuru",524124);

	}
}



























