package hu.petrik;

public class Deltoid extends Sikidom {

    private double a, b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Deltoid(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected double keruletSzamit() {
        return 2 * (a + b);
    }

    @Override
    protected double teruletSzamit() {
        return a * b;
    }
}
