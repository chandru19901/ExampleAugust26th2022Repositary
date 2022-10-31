package AbstractClass;
abstract class Serial
{
	static String serialname;
	static String Directorname;

	static
	{
		serialname="jothejotheyali";
		Directorname="jagadish";


		System.out.println("name of the serial:"+serialname);
		System.out.println("name of the director:"+Directorname);
	}

}
class Director extends Serial
{
	Director() {


		super();

	}
}



public class Assign4 {

	public static void main(String[] args) {

		Director obj=new Director();


	}

}


