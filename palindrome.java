import java .util.Scanner;
class Palindrome {
public static void main(String[] args) {
        int r;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int t=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(t==sum)
        {
            System.out.println("palindrome  number"+sum);
         
        }
        else
        {
            System.out.println("not a palindrome number"+sum);
         
        }
      }
}
