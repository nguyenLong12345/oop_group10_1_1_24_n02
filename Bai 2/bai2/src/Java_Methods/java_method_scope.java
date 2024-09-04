package Java_Methods;

public class java_method_scope {
    public class Main {
        public static void main(String[] args) {
      
          // Code here CANNOT use x
      
          int x = 100;
      
          // Code here can use x
          System.out.println(x);
        }
      }
}
