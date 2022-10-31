package AbstractClass;

//MLI  SUPER CLASS ,SUB CLASS ARE IN ABSTARCT CLASS
//ALL THREE CONTAIN SAME INSTANCE METHLOD

abstract class Student1
{
	String bookname1; 
	void show1()
	{
		System.out.println("book1: "+bookname1);
	}
}

abstract class Library1 extends Student1
{
	String bookname1;
	Library1()
	{
		super.bookname1="corejava";
	}
	void show()
	{
		System.out.println(bookname1);
	}
}
abstract class Library2 extends Library1
{
	String bookname1;
	Library2()
	{
		super.bookname1="Java";
		this.bookname1="$25";
	}
	void dispaly()
	{
		System.out.println(bookname1);
	}
}
class Lib3 extends Library2
{
	Lib3()
	{
		super();
	}


	public class Assign7 {

		public static void main(String[] args) {

			Lib3 o=new Lib3();

			o.show();
			o.dispaly();
			o.show1();

		}

	}

}
