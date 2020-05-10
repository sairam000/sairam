class A
{
A()
{
System.out.println("a");
}
A(int i)
{
System.out.println(i);
}
}
class B extends A
{
B()
{
System.out.println("b");
}
B(int i)
{
this();
System.out.println("value is  " + i);
}
}

class test
{
public static void main(String []s)
{
new B(7);
}
}