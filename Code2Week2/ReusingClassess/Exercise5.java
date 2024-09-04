package Code2Week2.ReusingClassess;

class A {
    A(){};
}

class B {
    B(){};
    public void run(){
        System.out.println("method run");
    }
}

public class Exercise5 extends A {
    public static void main(String[] args) {
        Exercise5 obj = new Exercise5();
    }
}
