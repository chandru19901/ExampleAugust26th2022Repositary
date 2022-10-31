package AbstractClass;

abstract class College
{

	College(String branches,String cityname)
	{


		System.out.println("branch Name:"+branches);
		System.out.println("cityname:"+cityname);
	}

}


class LVD  extends College
{

	LVD(String branches, String cityname) {
		super(branches, cityname);
	}


}



public class Assign1 {

	public static void main(String[] args) {
		LVD obj=new LVD("science","raichur");



	}

}
