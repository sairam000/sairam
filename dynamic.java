class A
{
void call()
{
System.out.println("class A");
}
}
class B extends A
{
void call()
{
System.out.println("class B");
}
}
class C extends A
{
void call()
{
System.out.println(" class C");
}
}
class Dynamic
{
public static void main(String []args)
{
A a=new A();
B b=new B();
C c=new C();
A x;
x=a;
x.call();
B y;
y=b;
y.call();
C z;
z=c;
z.call();
}
}