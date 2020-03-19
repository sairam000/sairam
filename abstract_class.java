abstract class A
{
void show()
{
System.out.println("this is class A");
}
abstract void showA();
}
class B extends A
{
void show1()
{
show();
System.out.println("this is class B");
}
public void showA()
{

System.out.println("this is class A b's implements");
}
}
class x
{
public static void main(String []x)
{
B ob=new B();
ob.show1();
ob.showA();
}
}