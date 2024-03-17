package edu.fscj.cen3024c;

public class Calculator {
    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("subtracting: " + calc.subtract(10, 5));
        System.out.println("multiplying: " + calc.multiply(10,5));
    }
}
