package Code2Week2.ReusingClassess;

class A {
    A(String message) {
        System.out.println("Constructor of A: " + message);
    }
}

class B {
    B(String message) {
        System.out.println("Constructor of B: " + message);
    }
}

class C extends A {
    B b;

    C(String aMessage, String bMessage) {
        super(aMessage);
        b = new B(bMessage);
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        C c = new C("Message for A", "Message for B");
    }
}
