class Demo16
{

static int no=27;
public static void main(String[] args)
{

if((no % 3 == 0 )&&(no % 5 == 0))
{

System.out.println("foo boo");
}
else if (no % 3 == 0)
{
System.out.println("foo foo");

}
else if (no % 5 == 0)

{
System.out.println("boo boo");
}
else
{

System.out.println("invalid number");
}
}

}