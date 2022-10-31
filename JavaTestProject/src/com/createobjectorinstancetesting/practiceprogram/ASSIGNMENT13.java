package com.createobjectorinstancetesting.practiceprogram;

class TwoWheelers
{
	String firstName;
	String Wheels;
	int amount;
	String country;

}
class FourWheelers
{
	String Name;
	int amount;
	String Wheels;
	String country;


}
class HeavyVehicles
{
	String VehicleName;
	int amount;
	String Wheels;
	String country;
	public String vehicleName;

}
public class ASSIGNMENT13


{
	public static void main(String args[])
	{
		TwoWheelers bajaj=new TwoWheelers();
		bajaj.firstName="bajadiscover";
		bajaj.Wheels="Two Wheeles";
		bajaj.amount=130000;
		bajaj.country="india";
		System.out.println("first name:"+bajaj.firstName);
		System.out.println("Wheels:"+bajaj.Wheels);
		System.out.println("amount:"+bajaj.amount);
		System.out.println("country:"+bajaj.country);
		System.out.println("_ _ _ _ _ _ _ _");
		
		
		FourWheelers Shift=new FourWheelers();
		Shift.Name="HP";
		Shift.amount=65000;
		Shift.Wheels=" Four Wheels";
		Shift.country="india";		
		System.out.println("Name:"+Shift.Name);
		System.out.println("amount:"+Shift.amount);
		System.out.println("Wheels:"+Shift.Wheels);
		System.out.println("country:"+Shift.country);
		System.out.println("_ _ _ _ _ _ _ _");
		
		
		HeavyVehicles Lorry=new HeavyVehicles();
		Lorry.vehicleName="VRL";
		Lorry.amount=2000000;
		Lorry.Wheels="six Wheels";
		Lorry.country="india";
		System.out.println("vehicleName:"+Lorry.vehicleName);
		System.out.println("amount:"+Lorry.amount);
		System.out.println("Wheels:"+Lorry.Wheels);
		System.out.println("country:"+Lorry.country);
	}
}








