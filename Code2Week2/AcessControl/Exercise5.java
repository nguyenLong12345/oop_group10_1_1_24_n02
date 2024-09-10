package Code2Week2.AcessControl;

public class Exercise5 {
    public static void main(String[] args) {
        Ex5 e = new Ex5();
        // Accessing fields
        e.a = 1; // OK
        // e.b = 2; // Error: b la private
        e.c = 3; // OK (same package)
        e.d = 4; // OK (same package)

        // Accessing methods
        e.run1(); // OK
        // e.run2(); // Error: run2() method la private
        e.run3(); // OK (same package)
        e.run4(); // OK (same package)
    }
}
