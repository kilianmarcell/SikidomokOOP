package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Sikidom s1 = new Teglalap(1, 2);
        System.out.println(((Teglalap)s1).getA()); // == s1.getA();
        Teglalap t1 = new Teglalap(2, 4);
        System.out.println(t1.getA());
        System.out.println(s1);
        System.out.println(t1);
    }
}