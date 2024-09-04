package Java_Classes.java_Access_Modifiiers;

public class java_Static {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
      }
      public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
      }
      public static void main(String[ ] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error
    
        java_Static myObj8 = new java_Static();  // Create an object of Main
        myObj8.myPublicMethod(); // Call the public method
      }
}
