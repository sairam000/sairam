import java.util.*;
class foreach
{
public static void main(String []args)
{
List<Integer> l=Arrays.asList(1,5,2,4,9,7);
l.forEach(System.out::println);
System.out.println(l.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));
}
}
