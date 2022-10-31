package AbstractClass;

abstract class subject 
{
	static void write(String subname, String author ) 
	{
		System.out.println("subjectname:"+subname);
		System.out.println("authorname:"+author);

	}
}
class notebook extends subject
{
	notebook()
	{ 
		super();

	}
}

public class Assign3 {

	public static void main(String[] args) {
		subject.write("api","dr prabhakar");


	}

}
