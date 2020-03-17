class Student
{
int id;
String name;
void get(int id,String name)
{
this.id=id;
this.name=name;
}
void display()
{
System.out.println(id);
System.out.println(name);
}
}
class Marks extends Student
{ 
int a,b,c;
void get1(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
}
void display1()
{
display();
int total=(a+b+c);
System.out.println(total);
System.out.println("avg of three num"+total/3);
}
}
class Result
{
public static void main(String x[])
{
int id=Integer.parseInt(x[0]);
String name=x[1];
int a=Integer.parseInt(x[2]);
int b=Integer.parseInt(x[3]);
int c=Integer.parseInt(x[4]);
Marks m=new Marks();
m.get(id,name);
m.get1(a,b,c);
m.display1();
}
}
