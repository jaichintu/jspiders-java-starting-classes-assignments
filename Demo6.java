class Demo6
{
static void area_of_circle()
{
final double p = 3.143;

int r = 30;

double a = p*r*r;


System.out.println("the value is " +a);

return;

}
static void area_of_triangle()
{


int b = 40;

int h = 60;

double a = b*h/2;


System.out.println("the value is " +a);

return;
}
static void area_of_square()
{


int a = 40;

int area = a*a;


System.out.println("the value is " +area);

return;
}
static void area_of_rectangle()
{


int w = 40;

int h = 60;

int a = w*h;


System.out.println("the value is " +a);

return;
}
static void area_of_parallelogram()
{


int b = 40;

int h = 60;

int a = b*h;


System.out.println("the value is " +a);

return;
}
static void area_of_trapezoid()
{


int a = 40;

int b = 40;

int h = 50;

double area_trapezoid = 0.5*a+b*h;


System.out.println("the value is " +area_trapezoid);

return;
}
static void area_of_ellipse()
{

final double p = 3.143;
int a = 40;

int b = 60;

double area_ellipse = p*a*b;


System.out.println("the value is " +area_ellipse);

return;
}
static void area_of_sector()
{


int r = 40;

int t = 60;

double a = 0.5*r*r*t;


System.out.println("the value is " +a);

return;
}



public static void main(String[] args)
{
System.out.println("......main starts......");

area_of_circle();
area_of_triangle();
area_of_square();
area_of_rectangle();
area_of_parallelogram();
area_of_trapezoid();
area_of_ellipse();
area_of_sector();

System.out.println("........main ends........");


}
}