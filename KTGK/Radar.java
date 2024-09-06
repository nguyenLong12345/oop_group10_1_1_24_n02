package KTGK;

public class Radar {

    private double computeDiscreteSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (n / 15.0);
        }
        return 0;
    }

    public void printSignalAt(int n) {
        double value = computeDiscreteSignal(n);
        System.out.printf("X tại n=%d: %.2f", n, value);
    }

    public static void main(String[] args) {
        Radar radar = new Radar();

        radar.printSignalAt(4);
    }
}