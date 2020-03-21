class sai implements Runnable
{
public void run()
{
for(int i=1;i<=3;i++)
{
System.out.println("sai");
try
{
Thread.sleep(1000);
}
catch(Exception e){
}
}
}
}
class ram implements Runnable
{
public void run()
{
for(int i=1;i<=3;i++)
{
System.out.println("ram");
try
{
Thread.sleep(1000);
}
catch(Exception e){
}
}
}
}
class Myclass extends Threads
{
public static void main(String []args)
{
Runnable r1=new sai();
Runnable r2=new ram();
Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
t1.start();
try
{
Thread.sleep(1000);
}
catch(Exception e){
}
t2.start();
}
}
