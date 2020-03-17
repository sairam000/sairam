class Constructor {
    
    public static void main(String[] args) {
        A y=new A(5,7);
        y.sum();
        
    }
    
}
class A
{
    int a,b;
    A(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void sum()
    {
        int c =a+b;
        System.out.println(c);
    }
}