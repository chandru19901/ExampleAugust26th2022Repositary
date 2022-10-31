package AbstractClass;

abstract class mobile
{
	mobile(String name)
	{
		System.out.println("mobile name is:"+name);
	}

	mobile(int price)
	{
		System.out.println("mobile price is:"+price);
	}
}
class laptop extends mobile
{

	laptop(String name) {
		super(name);
	}
	laptop(int price){
		super(price);
	}
}
class galaxy extends laptop
{
	galaxy(String brand){
		super(brand);
	}
	galaxy(int price) {
		super(price);
	}


}

public class Assign2 {

	public static void main(String[] args) {

		galaxy obj=new galaxy("iphone");
		galaxy obj1=new galaxy(90000);

	}

}
