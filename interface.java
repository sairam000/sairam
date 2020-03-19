interface Animal
{
abstract void move();
abstract void produce();
}
class Bird implements Animal
{
public void move()
{
System.out.println("birds fly");
}
public void produce()
{
System.out.println("birds egg grows to baby");
}
}
class Monkey implements Animal
{
public void move()
{
System.out.print("monkey jumps \n");
}
public void produce()
{
System.out.print("monkeys babies \n");
}
}
class Human implements Animal
{
public void move()
{
System.out.print("humans walks \n");
}
public void produce()
{
System.out.print("human baby \n");
}
}
class Demo{
public static void main(String []x)
{
System.out.print("different animals behaves differently \n");
Animal a=new Bird();
a.move();
a.produce();
Animal b=new Monkey();
b.move();
b.produce();
Animal c=new Human();
c.move();
c.produce();
}
}

