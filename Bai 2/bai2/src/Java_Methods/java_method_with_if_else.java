package Java_Methods;

public class java_method_with_if_else {
    static void CheckAge(int age){
        if (age < 18){
            System.out.println("Access denied - You are not old enough!");
        } else{
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        CheckAge(20);
    }
}
