import java .util.Scanner;
class fibonacci {
public static void main(String[] args) {
     int a=0,b=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("enter number");
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+"");
            
            int c=a+b;
            a=b;
            b=c;
            
                    
        }
      }
}