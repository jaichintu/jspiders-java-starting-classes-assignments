class Sample3
{
 void sumofnumbers()
{
int evensum=0;
int oddsum=0;
int i=1;

while(i<=50)
{
if(i%2==0)
{
evensum = evensum + i;
}
else{
oddsum = oddsum + i;
}
i++;
}
System.out.println(evensum);
System.out.println(oddsum);
}
public static void main(String[] args)
{
Sample3 s1 = new Sample3();
s1.sumofnumbers();
}

}