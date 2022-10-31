package com.parameterstesting.practiceprogram;

class TwoWheelers
{
	String firstName;
	int amount;
	String Wheels;
	String country;
	TwoWheelers(String fn,int at,String ws,String ct)
	{
		firstName=fn;
		amount=at;
		Wheels=ws;
		country=ct;
		System.out.println("first name:"+firstName);
		System.out.println("Wheels:"+Wheels);
		System.out.println("amount:"+amount);
		System.out.println("country:"+country);

	}

}
class FourWheelers
{
	String Name;
	int amount;
	String Wheels;
	String country; 
	FourWheelers(String nm,int at,String ws,String ct)
	{
		Name=nm;
		amount=at;
		Wheels=ws;
		country=ct;		
		System.out.println("Name:"+Name);
		System.out.println("amount:"+amount);
		System.out.println("Wheels:"+Wheels);
		System.out.println("country:"+country);


	}


}
class HeavyVehicles
{
	String VehicleName;
	int amount;
	String Wheels;
	String country;
	HeavyVehicles(String vc,int at,String ws,String ct)
	{
		VehicleName=vc;
		amount=at;
		Wheels=ws;
		country=ct;
		System.out.println("VehicleName:"+VehicleName);
		System.out.println("amount:"+amount);
		System.out.println("Wheels:"+Wheels);
		System.out.println("country:"+country); 
	}
}
public class ASSIGNMENT13


{
	public static void main(String args[])
	{
		TwoWheelers bajaj=new TwoWheelers("bajajdiscover",130000,"twowheels","india");
		TwoWheelers bajaj1=new TwoWheelers("herohonda",1500000,"Twoheels","japan");

		FourWheelers Shift=new FourWheelers("hp",65000,"fourWheels","india");
		FourWheelers Shift1=new FourWheelers("verna",120000,"fourwheels","japan");

		HeavyVehicles Lorry=new HeavyVehicles("vrl",2000000,"sixwheels","india");
		HeavyVehicles Lorry1=new HeavyVehicles("eicher",2500000,"sixwheels","taiwan");

	}
}








