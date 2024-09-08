package Code2Week2.ReusingClassess;

class Component1 {
    public Component1() {
        System.out.println("Component1 default constructor called");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component2 default constructor called");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component3 default constructor called");
    }
}

class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    public Root() {
        System.out.println("Root default constructor called");
    }
}

class Stem extends Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    public Stem() {
        System.out.println("Stem default constructor called");
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}
