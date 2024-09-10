package Code2Week2.AcessControl;

public class Exercise6 {
    protected int a;

    public Exercise6(int data) {
        this.a = data;
    }
}

class Ex6 {
    public void run(Exercise6 obj) {
        obj.a += 10; // Manipulating the protected data
    }

    public static void main(String[] args) {
        Exercise6 obj1 = new Exercise6(5);
        Ex6 obj2 = new Ex6();

        System.out.println("Before run: " + obj1.a);
        obj2.run(obj1);
        System.out.println("After run: " + obj1.a);
    }
}