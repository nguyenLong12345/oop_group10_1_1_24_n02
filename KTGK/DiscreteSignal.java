package KTGK;

import java.util.HashMap;
import java.util.Map;

public class DiscreteSignal implements Signal {
    private double A;
    private double T;
    private double N;
    private double F;

    @Override
    public double getA() {
        return A;
    }

    @Override
    public double getT() {
        return T;
    }

    @Override
    public double getN() {
        return N;
    }

    @Override
    public double getF() {
        return F;
    }

    private Map<Integer, Double> x;
    
    public DiscreteSignal() {
        x = new HashMap<>();
    }

    public void addValue(int index, double value) {
        x.put(index, value);
    }

    public double getValueAt(int n) {
        return x.getOrDefault(n, 0.0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Discrete Signal:\n");
        for (Map.Entry<Integer, Double> entry : x.entrySet()) {
            sb.append(String.format("x(%d) = %.2f\n", entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }
}

