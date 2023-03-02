package org.stepic.java.Lesson4_1.Square;

public class SquareRoot {
    public static double sqrt(double x) {
        if (x>=0) {
            return Math.sqrt(x);
        }
        else {
        throw new IllegalArgumentException("Expected non-negative number, got " + x); }
        // your implementation here
    }

    public static void main(String[] args) {
        double y=-2;
        System.out.println(SquareRoot.sqrt(y));
    }
}
