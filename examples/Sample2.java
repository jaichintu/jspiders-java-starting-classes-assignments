class Sample2
{
static void oddnumbers()
{
int sum=0;
int i=30;

while(i>=10)
{
if(i%2!=0)
{
sum = sum - i;
}
i++;
}
System.out.println(sum);
}
public static void main(String[] args)
{
Sample2.oddnumbers();
}

}