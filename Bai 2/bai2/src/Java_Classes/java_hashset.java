package Java_Classes;
// Import the HashSet class
import java.util.HashSet;

public class java_hashset {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.contains("Mazda"));
    cars.remove("Volvo");
    System.out.println(cars);
    cars.clear();
    System.out.println(cars);
  }
}