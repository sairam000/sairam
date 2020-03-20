class cloning
{
public static void main(String []args)
{
A obj=new A();
obj.i=7;
obj.j=3;
A obj1=obj;
obj1.i=4;
System.out.println(obj1);
}
}
class A
{
int i,j;
public String toString()
{
return "i="+i +"j="+j;
}
}
