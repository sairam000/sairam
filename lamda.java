class Lamda
{
public static void main(String []args)
{
A obj=() ->{
System.out.println("hello");
};
obj.show();
}
}
interface A
{
void show();
}