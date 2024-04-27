class Tester4
{
static void all(String str)
{
String reverse="";

for(int i=str.length()-1; i>=0; i--)
{
reverse=reverse + str.charAt(i);
}
if(str.equals(reverse))
{
System.out.println("pallendrome");
}
else{
System.out.println("not a pallendrome");

}

}
public static void main(String[] args)
{

all("Mam");
}

}