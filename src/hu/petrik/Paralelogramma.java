package hu.petrik;

public class Paralelogramma extends Sikidom {

    private double a, b;

    public Paralelogramma() {
        this.a = veletlenHossz();
        this.b = veletlenHossz();
    }

    public Paralelogramma(double a, double b) {
        this.a = a;
        this.b = b;
    }

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

    @Override
    protected double keruletSzamit() {
        return 2 * (a + b);
    }

    @Override
    protected double teruletSzamit() {
        return a * b;
    }
}
