class A
{
int id;
String name;
class B
{
public void show()
{
System.out.println("hai");
}
}
}
class X
{
public static void main(String []args)
{
A o=new A();
A.B obj=o.new B();
obj.show();
}
}