import java.util.Scanner;
class Perfect_number {
    public static void main(String[] args) {
       int i,sum=0;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
        sum=sum+i;
        }
    }
    if(sum==n)
    {
        System.out.println(n +"perfect number");
    }
    else
    {
       System.out.println(n +" not a perfect number");
    }
   }
    
}