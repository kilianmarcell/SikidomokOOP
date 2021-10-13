package hu.petrik;

public class Teglalap extends Sikidom{

    private double a, b;

    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    protected double keruletSzamit() {
        return 2 * (a + b);
    }

    @Override
    protected double teruletSzamit() {
        return a * b;
    }

    @Override
    public String toString() {
        return String.format("Téglalap { a = %f; b = %f}", a, b, super.toString());
    }
}
