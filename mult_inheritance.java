class A
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
class B extends A
{
int a, b;
void get1(int id,String name,int a,int b)
{
get(id,name);
this.a=a;
this.b=b;
}
void display1()
{
display();
}
}
class C extends B
{
int c;
void get2(int id,String name,int a,int b,int c)
{
get1(id,name,a,b);
this.c=c;
}
void display2()
{
display1();
System.out.println(a+b+c);
}
}
class Marks
{
public static void main(String []args)
{
int id=Integer.parseInt(args[0]);
String name=args[1];
int a=Integer.parseInt(args[2]);
int b=Integer.parseInt(args[3]);
int c=Integer.parseInt(args[4]);
C ob=new C();
ob.get2(id,name,a,b,c);
ob.display2();
}
}
