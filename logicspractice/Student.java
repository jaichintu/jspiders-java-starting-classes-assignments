class Student
{
int stdid;
String stdname;
char stdsec;
Student(int stdid,String stdname,char stdsec)
{
this.stdid = stdid;
this.stdname = stdname;
this.stdsec = stdsec;
return;


}
public static void main(String[] args)
{
Student a1=new Student(1334,"xyz",'A');
System.out.println(a1.stdid);
System.out.println(a1.stdname);
System.out.println(a1.stdsec);



}



}