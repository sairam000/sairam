class sai extends Thread
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
class ram extends Thread
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
class Demothread
{
public static void main(String []args)
{
sai t1=new sai();
ram t2=new ram();
t1.start();
try
{
Thread.sleep(500);
}
catch(Exception e){
}
t2.start();
}
}
