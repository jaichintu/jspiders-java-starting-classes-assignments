class Tester3
{
static void all(int no)
{
int fact=1;

for(int i=no; i>=1; i--)
{
fact=fact*i;
}
System.out.println(fact);

}
public static void main(String[] args)
{

all(5);
}

}