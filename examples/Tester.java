class Tester
{
static void evenodd(int a,int b)
{
	System.out.println("even numbers are ");
for(int i=a; i<=b; i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
System.out.println("odd numbers are ");
for(int i=a; i<=b; i++)
{
if(i%2==1)
{
System.out.println(i);
}
}
}
public static void main(String[] args)
{
evenodd(1,10);

}


}