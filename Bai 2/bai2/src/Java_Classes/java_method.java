package Java_Classes;

public class java_method {
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args){
        myStaticMethod();
        java_method myObj5 = new java_method();
        myObj5.myPublicMethod();
    }
}
