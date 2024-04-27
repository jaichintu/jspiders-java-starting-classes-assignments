class Sample24
{
public static void main(String[] args)
{

String str="java is programming language";

String [] arr=str.split(" ");



for(int i=0; i<arr.length; i++)

{

reverse(arr[i]);



}





}

public static void reverse(String ch)
	{

	String rev="";

	for(int i=ch.length()-1; i>=0; i--)
		{
	
			rev=rev+ch.charAt(i);
	
		}

		System.out.println(rev);


	}


}