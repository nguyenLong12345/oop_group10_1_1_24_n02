package Java_Classes;

import java.util.Scanner;

class java_user_input {
  public static void main(String[] args) {
    Scanner myObj14 = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj14.nextLine();

    // Numerical input
    int age = myObj14.nextInt();
    double salary = myObj14.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
