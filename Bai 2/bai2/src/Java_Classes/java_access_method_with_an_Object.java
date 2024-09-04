package Java_Classes;

public class java_access_method_with_an_Object {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    public static void main(String[] args) {
        java_access_method_with_an_Object myCar = new java_access_method_with_an_Object();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
      }
}

