package org.stepic.java.Lesson3_4;

public final class DeclaringModifierFinal {
    final int a = 5;
    final static int b = 4;
    /* constructor is impossible to make using modifier final */
    final int Summa (final int i, final int j) {
        //final i =3;
        int p = 8;
        int q = 9;
        return i+j;
    }

    public static void main(String[] args) {
        System.out.println(b);
    }
}