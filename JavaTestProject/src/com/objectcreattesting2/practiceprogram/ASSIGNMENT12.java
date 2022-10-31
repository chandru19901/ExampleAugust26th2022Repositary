package com.objectcreattesting2.practiceprogram;

class Desktop
{
	String firstName;
	String ram;
	int amount;
	String country;
	Desktop()
	{
		firstName="delllap";
		ram="1TB";
		amount=25000;
		country="india";
		System.out.println("first name:"+firstName);
		System.out.println("ram:"+ram);
		System.out.println("amount:"+amount);
		System.out.println("comp:"+country);
		System.out.println("_ _ _ _ _ _ _ _");


	}

}
class Laptop
{
	String lapName;
	int amount;
	String ram;
	String country;
	Laptop()
	{
		lapName="HP";
		amount=65000;
		ram="256GB";
		System.out.println("lapName:"+lapName);
		System.out.println("amount:"+amount);
		System.out.println("ram:"+ram);
		System.out.println("country:"+country);
		System.out.println("_ _ _ _ _ _ _ _");

	}

}
class MobileDevice
{
	String CompName;
	int amount;
	String ram;
	String deviceName;
	MobileDevice()
	{
		CompName = "redme";
		amount=20000;
		String ram = "8 GB";
		deviceName="pocox2";
		System.out.println("compname:"+CompName);
		System.out.println("amount:"+amount);
		System.out.println("ram:"+ram);
		System.out.println("devicename:"+deviceName);
	}	
}

public class ASSIGNMENT12


{
	public static void main(String args[])
	{
		Desktop dell=new Desktop();


		Laptop lap=new Laptop();


		MobileDevice poco=new MobileDevice();

	}
}








