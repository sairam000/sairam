class A
{
void x()
{
System.out.println("x");
}
}
class B extends A
{
void Bx()
{
System.out.println("Bx");
}
}
class C extends A
{
void Cx()
{
System.out.println("Cx");
}
}
class test
{
public static void main(String []s)
{
B b=new B();
C c=new C();
value(b);
value(c);
}
static void value(A a)
{
a.x();
}
}





