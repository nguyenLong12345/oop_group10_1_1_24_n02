package test;

public class Main {
    public static void main(String[] args) {
        DiscreteSignal ds = new DiscreteSignal(5.0, 2.0, 10, 50);
        ds.SignalInfo();

        System.out.println("Tín hiệu rời rạc tại n = 0: " + ds.tinhDiscreteSignal(0));

        ContinuousSignal cs = new ContinuousSignal(7.0, 3.0, 20.0);
        cs.SignalInfo();
    }
}
