import java.util.ArrayList;
class My {
  public static void main(String[] args) {
    ArrayList<String> bikes = new ArrayList<String>();
    bikes.add("hero");
    bikes.add("honda");
    bikes.add("Fz");
    bikes.add("vespa");
    bikes.set(1,"bazaz");
    System.out.println(bikes);
    System.out.println(bikes.get(3));
    System.out.println(bikes.size());
  }
}