class Stud
{
private int stdId;
private String stdName;
public int getstdId()
{
return stdId;
}
public void setstdId(int stdId)
{
this.stdId=stdId;
}
public String getstdName()
{
return stdName;
}
public void setstdName(String stdName)
{
this.stdName=stdName;
}
}
class Encap
{
public static void main(String []x)
{
Stud s=new Stud();
s.setstdId(8);
s.setstdName("sairam");
System.out.println(s.getstdId());
System.out.println(s.getstdName());
}
}
