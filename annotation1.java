class Parent {

    public void justaMethod() {
        System.out.println("Parent class method");
    }
    
}

class Child extends Parent {

    @Override
    public void justaMethod() {
    super.justaMethod();
        System.out.println("Child class method");
    }
    @Deprecated
     public void show()
    {
    }
}
class X
{
public static void main(String []args)
{
Child c=new Child();
c.justaMethod();
}
}
