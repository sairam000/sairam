import java.util.*;
class map1
{
public static void main(String []args)
{
Map<Integer,String> m=new HashMap<>();
m.put(1,"sairam");
m.put(2,"ramsai");
m.put(3,"hai");
Set<Integer>  S=m.keySet();
for(Integer key : S)
{
System.out.println(key+" " +m.get(key));
}
}
}
