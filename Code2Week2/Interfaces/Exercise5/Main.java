package Exercise5;
import Exercise5.MyInterface;

public class Main implements MyInterface {
    @Override
    public void methodOne() {
        System.out.println("Method One implementation");
    }

    @Override
    public void methodTwo() {
        System.out.println("Method Two implementation");
    }

    @Override
    public void methodThree() {
        System.out.println("Method Three implementation");
    }

    public static void main(String[] args) {
        Main impl = new Main();
        impl.methodOne();
        impl.methodTwo();
        impl.methodThree();
    }
}
