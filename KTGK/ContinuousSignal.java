package KTGK;

public class  ContinuousSignal implements Signal{
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
    
}