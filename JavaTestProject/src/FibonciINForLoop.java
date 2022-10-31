
public class FibonciINForLoop {

	public static void main(String[] args) {

		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		for(int i=1;i<=10;i++)
		{
			int third=first+second;
			first=second;
			second=third;
			System.out.println(third);
		}

	}
}
