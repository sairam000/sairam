import java.util.Collection;
import java.util.ArrayList;
class demo1
{
public static void main(String []args)throws Exception
{
Collection<Integer> c=new ArrayList<>();
c.add(6);
c.add(5);
for(int i : c)
{
System.out.println(i);
}
}
}