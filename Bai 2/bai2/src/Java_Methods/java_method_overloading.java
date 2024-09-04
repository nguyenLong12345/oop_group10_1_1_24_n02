package Java_Methods;

public class java_method_overloading {
    static int plusMethodInt(int x, int y) {
        return x + y;
      }
      
      static double plusMethodDouble(double x, double y) {
        return x + y;
      }
      public static void main(String[] args) {
        int num1 = plusMethodInt(3, 7);
        double num2 = plusMethodDouble(4.3, 6.28);
        System.out.println(num1);
        System.out.println(num2);
      }
}
