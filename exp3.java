class A
{
int i=13;
public static void x()
{
System.out.println("haii");
}
}
class B extends A
{
int i=10;
public static void x()
{
System.out.println("helloi");
}
}
class test
{
public static void main(String []s)
{
A a=new B();
System.out.println(a.i);
a.x();
}
}

