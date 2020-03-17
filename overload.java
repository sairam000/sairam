import java.util.Scanner;
class A 
{
void sum(int a,int b)
{
System.out.println(a+b);
}
void sum(double x,float y)
{
System.out.println(x+y);
}
void sum(String s1,String s2)
{
System.out.println(s1+s2);
}
}
class Overloading
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
double x=sc.nextDouble();
float y=sc.nextFloat();
String s1=sc.next();
String s2=sc.next();
A ob=new A();
ob.sum(a,b);
ob.sum(x,y);
ob.sum(s1,s2);
}
}


