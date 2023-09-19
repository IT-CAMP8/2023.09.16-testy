package pl.camp.it.testy;

public class Calculator {

    public Calculator() {
        System.out.println("Konstruktor kalkulatora !!");
    }

    public int add(int a, int b) {
        return a+b;
    }

    public double divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException();
        }
        return ((double) a)/((double) b);
    }
}
