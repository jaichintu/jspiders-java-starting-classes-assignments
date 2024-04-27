 class Up {
	
	int x = 10;
}
class Ppp extends Up
{
   void test()
   {
	   System.out.println("hello");
   }
}
class Mainclass1
{
public static void main(String[] args)
{
Up s1 = new Ppp();
System.out.println(s1.x);

Ppp d1 = (Ppp) s1;
System.out.println(d1.x);
d1.test();
}
}