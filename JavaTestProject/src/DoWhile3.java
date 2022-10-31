
public class DoWhile3 {

	public static void main(String[] args) {
		int i=5;
		do
		{
			int j=1;
			do

			{	
				System.out.print(j+" ");
				j++;
			}while(i>=j);
			System.out.println();
			i--;
		}
		while(i>=1);
	}


}


