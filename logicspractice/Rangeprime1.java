
public class Rangeprime1 {
	public static void main(String[] args) {
		int n = 8;
		for(int j=n +1; j<=Integer.MAX_VALUE; j++)
		{
			int no=j;
			boolean flag = true;
			for(int i=2; i<=no; i++)
			{
				if(no % i==0)
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
			{
				System.out.println(no+ "prime number");
				break;
			}
		}
	}

}
