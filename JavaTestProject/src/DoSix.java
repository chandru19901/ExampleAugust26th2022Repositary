
public class DoSix {

	public static void main(String[] args) {
		int k=1;
		int i=1;
		do
		{
			int j=1;
			do

			{
				int a=k*2;
				System.out.print(a+" ");
				j++;
				k++;
			}while(i>=j);
			System.out.println();
			i++;
		}
		while(i<=5);
	}
}




