package Exercises_107;

public class exerceise4_107 {
    public exerceise4_107() {
        System.out.println("Default constructor called: Object created!");
    }
    public exerceise4_107(String message) {
        System.out.println("Overloaded constructor called with message: " + message);
    }
    public static void main(String[] args) {
        exerceise4_107 thu = new exerceise4_107();
        System.out.println(thu);
        exerceise4_107 overload = new exerceise4_107("Hello from the overloaded constructor!");
        System.out.println(overload);
    }
}
