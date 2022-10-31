package AbstractClass;

//MLI ALL SUB CLASS CONA

abstract class lib
{
	static String bookname;
	void show1()
	{
		System.out.println("bookname :"+ bookname);
	}
}
abstract class lib1 extends  lib
{

	static String bookname;
	lib1()
	{
		super.bookname="java";
	}
	void show2()
	{
		System.out.println("bookname1: "+bookname);
	}
}
abstract class lib2 extends  lib1
{
	static String booknamecost;
	lib2()
	{
		super.bookname="java script";
		this.booknamecost="$25";
	}
	void show3()
	{
		System.out.println("bookname cost:"+booknamecost);
	}
}
class lib31 extends  lib2
{
	lib31()
	{
		super();
	}
}



public class Assign8 {

	public static void main(String[] args) {

		lib31 o=new lib31();

		o.show1();
		o.show2();
		o.show3();

	}

}
