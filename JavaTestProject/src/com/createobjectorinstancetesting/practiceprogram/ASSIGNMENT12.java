package com.createobjectorinstancetesting.practiceprogram;

class Desktop
{
	String firstName;
	String ram;
	int amount;
	String country;



}
class Laptop
{
	String lapName;
	String ram;
	int amount;
	String country;


}
class MobileDevice
{
	String CompName;
	int amount;
	String ram;
	String deviceName;
	public String compName;

}
public class ASSIGNMENT12


{
	public static void main(String args[])
	{
		Desktop dell=new Desktop();
		dell.firstName="delllap";
		dell.ram="1TB";
		dell.amount=25000;
		dell.country="india";
		System.out.println("first name:"+dell.firstName);
		System.out.println("ram:"+dell.ram);
		System.out.println("amount:"+dell.amount);
		System.out.println("comp:"+dell.country);
		System.out.println("_ _ _ _ _ _ _ _");
		
		Laptop lap=new Laptop();
		lap.lapName="HP";
		lap.amount=65000;
		lap.ram="256GB";
		lap.country="china";
		System.out.println("lapName:"+lap.lapName);
		System.out.println("amount:"+lap.amount);
		System.out.println("ram:"+lap.ram);
		System.out.println("country:"+lap.country);
		System.out.println("_ _ _ _ _ _ _ _");
		
		MobileDevice poco=new MobileDevice();
		poco.compName="redme";
		poco.amount=20000;
		poco.ram="8 GB";
		poco.deviceName="pocox2";
		System.out.println("compname:"+poco.compName);
		System.out.println("amount:"+poco.amount);
		System.out.println("ram:"+poco.ram);
		System.out.println("devicename:"+poco.deviceName);
	}
}








