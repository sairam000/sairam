class A
{
void y()
{
System.out.println("hai");
}
}
class B extends A
{
void x()
{
System.out.println("hello");
}
}
class test
{
public static void main(String []s)
{
B b=new A();
b.x();
}
}
