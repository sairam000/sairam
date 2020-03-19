class Student extends Object
{
int id;
String name;
Student(int id,String name)
{
this.id=id;
this.name=name;
}
public String toString()
{
return id +"  "+ name;
}
}
class Demostring
{
public static void main(String []args)
{
Student s=new Student(3,"sairam");
System.out.println(s);
}
}