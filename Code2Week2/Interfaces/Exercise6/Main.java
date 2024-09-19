package Exercise6;

public class Main implements PublicMethodsInterface {
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
        Main test = new Main();
        test.methodOne();
        test.methodTwo();
        test.methodThree();
    }
}
