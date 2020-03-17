class Living
{
void show()
{
System.out.println("we are human beings");
}
}
class Man extends Living
{
void showM()
{
show();
System.out.println("we can talk");
}
}

class Fish extends Living
{
void showF()
{
show();
System.out.println("they can swim");
}
}
class A
{
public static void main(String []x)
{
Man z=new Man();
Fish y=new Fish();
z.showM();
y.showF();
}
}