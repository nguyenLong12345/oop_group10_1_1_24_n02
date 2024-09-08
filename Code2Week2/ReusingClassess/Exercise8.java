package Code2Week2.ReusingClassess;

class Base {
    public Base(int value) {
        System.out.println("Base class constructor called with value: " + value);
    }
}

class Derived extends Base {

    public Derived() {
        super(0);
        System.out.println("Derived class default constructor called");
    }

    public Derived(int value) {
        super(value);
        System.out.println("Derived class non-default constructor called with value: " + value);
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        Derived obj1 = new Derived();

        Derived obj2 = new Derived(42);
    }
}
