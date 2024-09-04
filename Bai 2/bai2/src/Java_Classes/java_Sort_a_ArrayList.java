package Java_Classes;

import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class java_Sort_a_ArrayList {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Collections.sort(cars);  // Sort cars

    for (String i : cars) {
      System.out.println(i);
    }
    Collections.sort(cars, Collections.reverseOrder());
    for (String i : cars) {
        System.out.println(i);
    }
  }
}
