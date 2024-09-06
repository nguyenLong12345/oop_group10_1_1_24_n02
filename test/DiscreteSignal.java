package test;

public class DiscreteSignal implements Signal {

    private double amplitude;
    private double frequency;
    private int time;
    private int period;
    
    public DiscreteSignal(double a, double f, int t, int p) {
        this.amplitude = a;
        this.frequency = f;
        this.time = t;
        this.period = p;
    }
    @Override
    public double getA() {
        return amplitude;
    }

    @Override
    public double getF() {
        return frequency;
    }

    // Hàm mô phỏng tín hiệu rời rạc dựa vào công thức x(n)
    public double tinhDiscreteSignal(int n) {
        double result = 0.0;
        for (int k = -100; k <= 100; k++) {
            result += calculateX(k) * delta(n - k);
        }
        return result;
    }

    private double calculateX(int k) {
        // Đây là mô phỏng một hàm x(k) tùy theo yêu cầu
        return Math.sin(2 * Math.PI * frequency * k);
    }

    private int delta(int n) {  // xung don vi
        return (n == 0) ? 1 : 0;
    }

    @Override
    public void SignalInfo() {
        System.out.println("Discrete Signal:");
        System.out.println("Amplitude: " + amplitude);
        System.out.println("Frequency: " + frequency);
        System.out.println("Time: " + time);
        System.out.println("Period: " + period);
    }
}
