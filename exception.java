class A extends Exception
{
A(String s)
{
super(s);
}
}
class B
{
int a,b;
B(int a,int b)
{
this.a=a;
this.b=b; 
}
void show()
{
try
{
if(a<b)
throw new A("we cant process order");
else
System.out.println("the new stock is"+(a-b));
}
catch(A e)
{
System.out.println("error "+e.getMessage());
}
}
}
class x
{
public static void main(String []args)
{
B x=new B(7,5);
x.show();
}
}