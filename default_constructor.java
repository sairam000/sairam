class Constructor {
   
    public static void main(String[] args) {
        A y=new A();
        y.sum();
        
    }
    
}
class A
{
    int a,b;
    A()
    {
        a=10;
        b=20;
    }
    void sum()
    {
        int c =a+b;
        System.out.println(c);
    }
}