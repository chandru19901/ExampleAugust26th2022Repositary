package com.parameterstesting.practiceprogram;

class Desktop
{
	String firstName;
	int amount;
	String ram;
	String country;
	Desktop(String fn,int at,String rm,String ct)
	{
		firstName=fn;
		amount=at;
		ram=rm;
		country=ct;
		System.out.println("first name:"+firstName);
		System.out.println("ram:"+ram);
		System.out.println("amount:"+amount);
		System.out.println("country:"+country);



	}

}
class Laptop
{
	String lapName;
	int amount;
	String ram;
	String country;
	Laptop(String ln,int at,String rm,String ct)
	{
		lapName=ln;
		amount=at;
		ram=rm;
		country=ct;
		System.out.println("lapName:"+lapName);
		System.out.println("amount:"+amount);
		System.out.println("ram:"+ram);
		System.out.println("country:"+country);


	}

}
class MobileDevice
{
	String CompName;
	int amount;
	String ram;
	String deviceName;
	MobileDevice(String cn,int at,String rm,String dn)
	{
		CompName = cn;
		amount=at;
		ram = rm;
		deviceName=dn;
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
		Desktop dell=new Desktop ("delllap",25000,"1tb","india");
		Desktop dell1=new Desktop ("lenolap",30000,"2tb","srilanka");

		Laptop lap=new Laptop("hp",65000,"256gb","china");
		Laptop lap1=new Laptop("asus",50000,"512gb","japan");


		MobileDevice poco=new MobileDevice("redme",20000,"8gb","pocox2");
		MobileDevice poc1o=new MobileDevice("realme",25000,"1024gb","xiomi");

	}
}








