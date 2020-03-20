import java.util.List;
import java.util.ArrayList;
class generics
{
public static void main(String []args) throws Exception
{
List<Integer> values=new ArrayList<>();
values.add(6);
values.add(7);
int i=Integer.parseInt(values.get(0).toString());
System.out.println(i);
}
}
s