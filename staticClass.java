class A
{
static int id;
static String name;
static class B
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
A.id=3;
A.name="sairam";
A.B obj=new A.B();
obj.show();
}
}