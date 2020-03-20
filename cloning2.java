class cloning1
{
public static void main(String []args)
{
A obj=new A();
obj.i=7;
obj.j=3;
A obj1=new A();
obj1.i=obj.i;
obj1.j=obj.j;
obj1.j=9;

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
