class Theatres
{
void all()
{
System.out.println("Booking confirmed");

}
}
class Bookmyshow
{
public static void main(String[] args)
{
Theatres a1=new Theatres();
Customer1.book(a1);
Customer2.book(a1);

}

}
class Customer1
{
static void book(Theatres a2)
{
a2.all();

}


}
class Customer2
{
static void book(Theatres a3)
{
a3.all();
}

}