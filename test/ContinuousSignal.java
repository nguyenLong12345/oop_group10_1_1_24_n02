package test;

public class ContinuousSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double wavelength;

    public ContinuousSignal(double amplitude, double frequency, double wavelength) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.wavelength = wavelength;
    }

    @Override
    public double getA() {
        return amplitude;
    }

    @Override
    public double getF() {
        return frequency;
    }

    public double getW() {
        return wavelength;
    }

    @Override
    public void SignalInfo() {
        System.out.println("Continuous Signal:");
        System.out.println("Amplitude: " + amplitude);
        System.out.println("Frequency: " + frequency);
        System.out.println("Wavelength: " + wavelength);
    }
}
