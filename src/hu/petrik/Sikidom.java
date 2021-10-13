package hu.petrik;

import java.util.Random;

public abstract class Sikidom {

    private final static Random RANDOM = new Random();

    protected final double veletlenHossz() {
        return RANDOM.nextDouble() * 10 + 5;
    }

    protected abstract double keruletSzamit();
    protected abstract double teruletSzamit();

    @Override
    public String toString() {
        return String.format("K = %f; T = %f", keruletSzamit(), teruletSzamit());
    }
}
