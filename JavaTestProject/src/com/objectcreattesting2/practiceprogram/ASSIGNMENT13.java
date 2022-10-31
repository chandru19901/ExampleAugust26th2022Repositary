package com.objectcreattesting2.practiceprogram;

class TwoWheelers
{
	String firstName;
	String Wheels;
	int amount;
	String country;
	TwoWheelers()
	{
		firstName="bajadiscover";
		Wheels="Two Weeles";
		amount=130000;
		country="india";
		System.out.println("first name:"+firstName);
		System.out.println("Wheels:"+Wheels);
		System.out.println("amount:"+amount);
		System.out.println("country:"+country);
		System.out.println("_ _ _ _ _ _ _ _");	
	}

}
class FourWheelers
{
	String Name;
	int amount;
	String Wheels;
	String country; 
	FourWheelers()
	{
		Name="HP";
		amount=65000;
		Wheels=" Four Wheels";
		country="india";		
		System.out.println("Name:"+Name);
		System.out.println("amount:"+amount);
		System.out.println("Wheels:"+Wheels);
		System.out.println("country:"+country);
		System.out.println("_ _ _ _ _ _ _ _");

	}


}
class HeavyVehicles
{
	String VehicleName;
	int amount;
	String Wheels;
	String country;
	String vehicleName;
	HeavyVehicles()
	{
		vehicleName="VRL";
		amount=2000000;
		Wheels="six Wheels";
		country="india";
		System.out.println("vehicleName:"+vehicleName);
		System.out.println("amount:"+amount);
		System.out.println("Wheels:"+Wheels);
		System.out.println("country:"+country); 
	}
}
public class ASSIGNMENT13


{
	public static void main(String args[])
	{
		TwoWheelers bajaj=new TwoWheelers();


		FourWheelers Shift=new FourWheelers();

		HeavyVehicles Lorry=new HeavyVehicles();

	}
}








