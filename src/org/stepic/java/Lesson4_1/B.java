package org.stepic.java.Lesson4_1;

public class B extends A {
    public static Object b = new String("y");


    public static void main(String[] args) {
        A a = (A) b;
        System.out.println(b);
        System.out.println(a);
    }
}
