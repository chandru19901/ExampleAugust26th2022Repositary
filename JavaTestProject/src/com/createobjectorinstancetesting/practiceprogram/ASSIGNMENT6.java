package com.createobjectorinstancetesting.practiceprogram;

class Country
{
	String firstname;
	int pincode;


}
class State
{
	String firstname;
	int pincode;

}
class District
{
	String firstname;
	int pincode;
}
class Village
{
	String firstname;
	int pincode;
}


public class ASSIGNMENT6

{
	public static void main(String args[])
	{
		Country India=new Country();
		India.firstname="India";
		India.pincode=560040;
		System.out.println("first name:"+India.firstname);
		System.out.println("ID:"+India.pincode);
		System.out.println("_ _ _ _ _ _ _ _ _ ");


		State kar=new State();
		kar.firstname="karnatka";
		kar.pincode=560033;
		System.out.println("firstName:"+kar.firstname);
		System.out.println("ID:"+kar.pincode);
		System.out.println("_ _ _ _ _ _ _ _ ");

		District DST=new District();
		DST.firstname="banglore";
		DST.pincode=560042;
		System.out.println("firstname:"+DST.firstname);
		System.out.println("ID:"+DST.pincode);
		System.out.println("_ _ _ _ _ _ _ _ ");

		Village VLG=new Village();
		VLG.firstname="Nammuru";
		VLG.pincode=524126;
		System.out.println("firstname:"+VLG.firstname);
		System.out.println("ID:"+VLG.pincode);
		System.out.println("_ _ _ _ _ _ _ _ ");

	}
}



























