package Code2Week2.ReusingClassess;

class A {
    A() {
        System.out.println("Constructor of A");
    }
}

class B {
    B() {
        System.out.println("Constructor of B");
    }
}

class C extends A {
    B b = new B();
}

public class Exercise5 {
    public static void main(String[] args) {
        C c = new C();
    }
}
