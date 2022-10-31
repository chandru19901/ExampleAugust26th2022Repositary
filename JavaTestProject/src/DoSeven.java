
public class DoSeven {

	public static void main(String[] args) {
		int k=1;
		int i=1;
		do
		{
			int j=1;
			do

			{	
				System.out.print(k+" ");
				k=k+2;
				j++;
			}while(i>=j);
			System.out.println();
			i++;
		}
		while(i<=5);
	}
}




