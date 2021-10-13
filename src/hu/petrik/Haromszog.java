package hu.petrik;

public class Haromszog extends Sikidom {

    private double a, b, c;

    public Haromszog() {
        a = veletlenHossz();
        b = veletlenHossz();
        c = veletlenHossz();

        while (!szerkeszthetoE(a, b, c)) {
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean szerkeszthetoE(double a, double b, double c) {
        return c > a + b && b > a + c && a > b + c;
    }

    public Haromszog(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    protected double keruletSzamit() {
        return a + b + c;
    }

    @Override
    protected double teruletSzamit() {
        double s = keruletSzamit() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return String.format("Háromszög{ a = %f; b = %f; c = %f }", a, b, c, super.toString());
    }
}