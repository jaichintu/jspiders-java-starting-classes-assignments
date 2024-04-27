class Demo7
{
static void area(int r)
{
final double p = 3.142;

double a = p*r*r;


System.out.println("the value is " +a);
return;
}


public static void main(String[] args)
{
System.out.println("......main starts......");

area(10);


System.out.println("........main ends........");


}
}