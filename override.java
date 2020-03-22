class A
{
int a,b;
A(int a,int b)
{
this.a=a;
this.b=b;
}
void sum()
{
System.out.println(a+b);
}
}
class B extends A
{
int c;
B(int a, int b,int c)
{
super(a,b);
this.c=c;
}
void sum()
{
super.sum();
{
System.out.println("sum is"+(a+b+c));
}
}
}
class Override
{
public static void main(String []args)
{
B ob=new B(3,4,5);
ob.sum();
}
}
